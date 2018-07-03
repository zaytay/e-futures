package com.tay.futures.util;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class ExcelUtils {
	
	/**
	 * 内存中允许的最大行数
	 */
	private static final int maxRowNum = 100000;
	
	private static final int TABLE_COL_WIDTH = 30;
	
	private static final Charset UTF_8 = Charset.forName("UTF-8");
	private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
	private static final String[] IEBrowserSignals =  new String[] {"MSIE", "Trident", "Edge"};

	private final static String excel2003L =".xls";    //2003- 版本的excel
	private final static String excel2007U =".xlsx";   //2007+ 版本的excel
	
	public static void writeExcelTable(
	        HttpServletRequest request, HttpServletResponse response, String filename, 
	        String[] headerNames, List<String[]> tableData) throws IOException {
	    // 头信息
	    response.setContentType("text/html; charset=UTF-8");
	    if (isMSBrowser(request)) {
            filename = URLEncoder.encode(filename, UTF_8.name());
        } else {
            filename = new String(filename.getBytes("UTF-8"), ISO_8859_1);
        }
	    response.reset();
	    response.setContentType("APPLICATION/OCTET-STREAM");
	    response.setHeader("Content-disposition", "attachment;filename=\"" + filename + "\"");
	    
		SXSSFWorkbook workBook = new SXSSFWorkbook(maxRowNum);
		workBook.setCompressTempFiles(true);
		OutputStream os = response.getOutputStream();
		if (CollectionUtils.isEmpty(tableData)) {
			// 空表
			workBook.write(os);
	        return ;
        }
		Sheet sheet = null;
        sheet = workBook.createSheet("sheet");
        sheet.setDefaultColumnWidth(TABLE_COL_WIDTH);
        CellStyle cellStyle = workBook.createCellStyle();
        cellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        
        int curRow = 0;
        // 表头
        Row header = sheet.createRow(curRow++);
        for (int col = 0; col < headerNames.length; col++) {
            Cell cell = header.createCell(col);
            cell.setCellValue(headerNames[col]);
        }
        // 表内容
        for (String[] colValues : tableData) {
            Row row = sheet.createRow(curRow++);
            for (int col = 0; col < colValues.length; col++) {
                Cell cell = row.createCell(col);
                cell.setCellValue(colValues[col]);
            }
        }
		
		workBook.write(os);
	}
	
	private static boolean isMSBrowser(HttpServletRequest request) {
	    String userAgent = request.getHeader("User-Agent");
	    for (String signal : IEBrowserSignals) {
            if (StringUtils.isNotBlank(userAgent) && userAgent.contains(signal)) {
                return true;
            }
        }
	    return false;
	}

	/**
	 * 描述：获取IO流中的数据，组装成List<List<Object>>对象
	 * @param in,fileName
	 * @return
	 * @throws IOException
	 */
	public static List<List<Object>> getBankListByExcel(InputStream in, String fileName) throws Exception{
		List<List<Object>> list;

		//创建Excel工作薄
		Workbook work = getWorkbook(in,fileName);
		if(null == work){
			throw new Exception("创建Excel工作薄为空！");
		}
		Sheet sheet;
		Row row;
		Cell cell;

		list = new ArrayList<>();
		//遍历Excel中所有的sheet
		for (int i = 0; i < work.getNumberOfSheets(); i++) {
			sheet = work.getSheetAt(i);
			if(sheet==null){continue;}

			//遍历当前sheet中的所有行
			for (int j = sheet.getFirstRowNum(); j < sheet.getLastRowNum()+1; j++) {
				row = sheet.getRow(j);
				if(row == null || j == 0) {continue;}

				//遍历所有的列
				List<Object> li = new ArrayList<>();
				for (int y = row.getFirstCellNum(); y < row.getLastCellNum()+1; y++) {
					cell = row.getCell(y);
					if(cell !=null){
						li.add(getCellValue(cell));
					}
				}
				list.add(li);
			}
		}
		in.close();
		return list;
	}

	/**
	 * 描述：根据文件后缀，自适应上传文件的版本
	 * @param inStr,fileName
	 * @return
	 * @throws Exception
	 */
	public static Workbook getWorkbook(InputStream inStr,String fileName) throws Exception{
		Workbook wb;
		String fileType = fileName.substring(fileName.lastIndexOf("."));
		if(excel2003L.equals(fileType)){
			wb = new HSSFWorkbook(inStr);  //2003-
		}else if(excel2007U.equals(fileType)){
			wb = new XSSFWorkbook(inStr);  //2007+
		}else{
			throw new Exception("解析的文件格式有误！");
		}
		return wb;
	}

	/**
	 * 描述：对表格中数值进行格式化
	 * @param cell
	 * @return
	 */
	public static Object getCellValue(Cell cell){
		Object value = null;
		DecimalFormat df = new DecimalFormat("0");  //格式化number String字符
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");  //日期格式化
		DecimalFormat df2 = new DecimalFormat("0.00");  //格式化数字

		switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				value = cell.getRichStringCellValue().getString();
				break;
			case Cell.CELL_TYPE_NUMERIC:
				if("General".equals(cell.getCellStyle().getDataFormatString())){
					value = df.format(cell.getNumericCellValue());
				}else if("m/d/yy".equals(cell.getCellStyle().getDataFormatString())){
					value = sdf.format(cell.getDateCellValue());
				}else{
					value = df2.format(cell.getNumericCellValue());
				}
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				value = cell.getBooleanCellValue();
				break;
			case Cell.CELL_TYPE_BLANK:
				value = "";
				break;
			default:
				break;
		}
		return value;
	}



	public static void writeCottonExcelTable(
			HttpServletRequest request, HttpServletResponse response, String filename,
			 List<String[]> tableData) throws IOException {
		// 头信息
		response.setContentType("text/html; charset=UTF-8");
		if (isMSBrowser(request)) {
			filename = URLEncoder.encode(filename, UTF_8.name());
		} else {
			filename = new String(filename.getBytes("UTF-8"), ISO_8859_1);
		}
		response.reset();
		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-disposition", "attachment;filename=\"" + filename + "\"");

		SXSSFWorkbook workBook = new SXSSFWorkbook(maxRowNum);
		workBook.setCompressTempFiles(true);
		OutputStream os = response.getOutputStream();
		if (CollectionUtils.isEmpty(tableData)) {
			// 空表
			workBook.write(os);
			return ;
		}
		Sheet sheet = null;
		sheet = workBook.createSheet("sheet");
		sheet.setDefaultColumnWidth(TABLE_COL_WIDTH);
		CellStyle cellStyle = workBook.createCellStyle();
		cellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);

		sheet.addMergedRegion(new CellRangeAddress(0,1,0,0));
		sheet.addMergedRegion(new CellRangeAddress(0,1,1,1));

		sheet.addMergedRegion(new CellRangeAddress(0,0,2,14));
		sheet.addMergedRegion(new CellRangeAddress(0,1,15,15));
		sheet.addMergedRegion(new CellRangeAddress(0,0,16,23));
		sheet.addMergedRegion(new CellRangeAddress(0,1,24,24));
		sheet.addMergedRegion(new CellRangeAddress(0,0,25,29));
		sheet.addMergedRegion(new CellRangeAddress(0,0,30,32));
		sheet.addMergedRegion(new CellRangeAddress(0,0,33,35));
		sheet.addMergedRegion(new CellRangeAddress(0,0,36,38));
		sheet.addMergedRegion(new CellRangeAddress(0,1,39,39));
		sheet.addMergedRegion(new CellRangeAddress(0,1,40,40));
		sheet.addMergedRegion(new CellRangeAddress(0,1,41,41));
		sheet.addMergedRegion(new CellRangeAddress(0,1,42,42));
		sheet.addMergedRegion(new CellRangeAddress(0,1,43,43));
		sheet.addMergedRegion(new CellRangeAddress(0,1,44,44));
		sheet.addMergedRegion(new CellRangeAddress(0,1,45,45));
		sheet.addMergedRegion(new CellRangeAddress(0,1,46,46));
		sheet.addMergedRegion(new CellRangeAddress(0,1,47,47));
		sheet.addMergedRegion(new CellRangeAddress(0,1,48,48));
		sheet.addMergedRegion(new CellRangeAddress(0,1,49,49));


		// 表头
		Row header1 = sheet.createRow(0);
		Row header2 = sheet.createRow(1);

		header1.createCell(0).setCellValue("批号");
		header1.createCell(1).setCellValue("升贴水");
		header1.createCell(2).setCellValue("颜色级");
		header1.createCell(15).setCellValue("平均长度");
		header1.createCell(16).setCellValue("长度分布");
		header1.createCell(24).setCellValue("马克隆平均值");
		header1.createCell(25).setCellValue("马值分布");
		header1.createCell(30).setCellValue("断裂比强度");
		header1.createCell(33).setCellValue("长整齐度");
		header1.createCell(36).setCellValue("轧工质量");
		header1.createCell(39).setCellValue("合计包数");
		header1.createCell(40).setCellValue("合计毛重");
		header1.createCell(41).setCellValue("合计皮重");
		header1.createCell(42).setCellValue("合计净重");
		header1.createCell(43).setCellValue("合计公重");
		header1.createCell(44).setCellValue("平均回潮");
		header1.createCell(45).setCellValue("平均含杂");
		header1.createCell(46).setCellValue("产地");
		header1.createCell(47).setCellValue("加工类型");
		header1.createCell(48).setCellValue("加工企业");
		header1.createCell(49).setCellValue("仓库");



		header2.createCell(2).setCellValue("白棉1级");
		header2.createCell(3).setCellValue("白棉2级");
		header2.createCell(4).setCellValue("白棉3级");
		header2.createCell(5).setCellValue("白棉4级");
		header2.createCell(6).setCellValue("白棉5级");
		header2.createCell(7).setCellValue("淡点污棉1级");
		header2.createCell(8).setCellValue("淡点污棉2级");
		header2.createCell(9).setCellValue("淡点污棉3级");
		header2.createCell(10).setCellValue("淡黄染棉1级");
		header2.createCell(11).setCellValue("淡黄染棉2级");
		header2.createCell(12).setCellValue("淡黄染棉3级");
		header2.createCell(13).setCellValue("黄染棉1级");
		header2.createCell(14).setCellValue("黄染棉2级");

		header2.createCell(15).setCellValue("平均长度");
		header2.createCell(16).setCellValue("32mm");
		header2.createCell(17).setCellValue("31mm");
		header2.createCell(18).setCellValue("30mm");
		header2.createCell(19).setCellValue("29mm");
		header2.createCell(20).setCellValue("28mm");
		header2.createCell(21).setCellValue("27mm");
		header2.createCell(22).setCellValue("26mm");
		header2.createCell(23).setCellValue("25mm");


		header2.createCell(24).setCellValue("马克隆平均值");
		header2.createCell(25).setCellValue("C1");
		header2.createCell(26).setCellValue("B1");
		header2.createCell(27).setCellValue("A");
		header2.createCell(28).setCellValue("B2");
		header2.createCell(29).setCellValue("C2");

		header2.createCell(30).setCellValue("平均值");
		header2.createCell(31).setCellValue("最大值");
		header2.createCell(32).setCellValue("最小值");

		header2.createCell(33).setCellValue("平均值");
		header2.createCell(34).setCellValue("最大值");
		header2.createCell(35).setCellValue("最小值");

		header2.createCell(36).setCellValue("P1");
		header2.createCell(37).setCellValue("P2");
		header2.createCell(38).setCellValue("P3");

		int curRow = 2;
		// 表内容
		for (String[] colValues : tableData) {
			Row row = sheet.createRow(curRow++);
			for (int col = 0; col < colValues.length; col++) {
				Cell cell = row.createCell(col);
				cell.setCellValue(colValues[col]);
			}
		}

		workBook.write(os);
	}
}
