package com.tay.futures.util;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
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
			for (int j = sheet.getFirstRowNum(); j < sheet.getLastRowNum(); j++) {
				row = sheet.getRow(j);
				if(row==null||row.getFirstCellNum()==j){continue;}

				//遍历所有的列
				List<Object> li = new ArrayList<>();
				for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
					cell = row.getCell(y);
					li.add(getCellValue(cell));
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
}
