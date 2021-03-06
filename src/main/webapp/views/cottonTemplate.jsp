<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>allBooksManger</title>
    <link href="${pageContext.request.contextPath}/css/base.css"
          type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/tab.css"
          type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/item.css"
          type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/item_do.css"
          type="text/css" rel="stylesheet">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/uploadify.css"
          type="text/css">
</head>
<link rel="stylesheet" type="text/css"
      href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
      href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript"
        src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/js/jquery.uploadify.v2.0.3.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/js/swfobject.js"></script>

<script type="text/javascript"
        src="${pageContext.request.contextPath}/js/common.js"></script>


<script type="text/javascript">
    var url;

    function searchUser() {
        $("#dg").datagrid('load', {
            "userName": $("#s_userName").val()
        });
    }

    function deleteUser() {
        var selectedRows = $("#dg").datagrid('getSelections');
        if (selectedRows.length == 0) {
            $.messager.alert("系统提示", "请选择要删除的数据！");
            return;
        }
        var strIds = [];
        for (var i = 0; i < selectedRows.length; i++) {
            strIds.push(selectedRows[i].id);
        }
        var ids = strIds.join(",");
        $.messager.confirm("系统提示", "您确认要删除这<font color=red>"
            + selectedRows.length + "</font>条数据吗？", function (r) {
            if (r) {
                $.post("${pageContext.request.contextPath}/template/delete.do", {
                    ids: ids
                }, function (result) {
                    if (result.success) {
                        $.messager.alert("系统提示", "数据已成功删除！");
                        $("#dg").datagrid("reload");
                    } else {
                        $.messager.alert("系统提示", "数据删除失败！");
                    }
                }, "json");
            }
        });

    }

    function openUserAddDialog() {
        $("#dlg").dialog("open").dialog("setTitle", "添加计算模板");
        url = "${pageContext.request.contextPath}/user/save.do";
    }

    function saveUser() {
        $("#fm").form("submit", {
            url: "${pageContext.request.contextPath}/template/save.do",
            onSubmit: function () {
                return $(this).form("validate");
            },
            success: function (result) {
                $.messager.alert("系统提示", "保存成功");
                resetValue();
                $("#dlg").dialog("close");
                $("#dg").datagrid("reload");
            }
        });
    }

    function openUserModifyDialog() {
        var selectedRows = $("#dg").datagrid('getSelections');
        if (selectedRows.length != 1) {
            $.messager.alert("系统提示", "请选择一条要编辑的数据！");
            return;
        }
        var row = selectedRows[0];
        $("#dlg").dialog("open").dialog("setTitle", "编辑用户信息");
        $('#fm').form('load', row);
        $("#password").val("******");
        url = "${pageContext.request.contextPath}/user/save.do?id=" + row.id;
    }

    function resetValue() {
        $("#template.name").val("");
        $("#min").val("");
        $("#max").val("");
        $("#price").val("");
        $("input[id^='ratioStrategy']").val("");
    }

    function closeUserDialog() {
        $("#dlg").dialog("close");
        resetValue();
    }
</script>






</head>
<body style="margin:1px;" id="ff">
<table id="dg" title="模板管理" class="easyui-datagrid" pagination="true"
       rownumbers="true" fit="true" data-options="pageSize:10"
       url="${pageContext.request.contextPath}/template/listAll.do" toolbar="#tb">
    <thead data-options="frozen:true">
    <tr>
        <th field="cb" checkbox="true" align="center"></th>
        <th field="id" width="10" align="center" hidden="true">编号</th>
        <th field="name" width="110" align="center">模板名称</th>
        <th field="content" width="200" align="center"
            formatter="formatHref">操作
        </th>
    </tr>
    </thead>
</table>
<div id="tb">
    <div>
        <a href="javascript:openUserAddDialog()" class="easyui-linkbutton"
           iconCls="icon-add" plain="true">添加</a>
      <%--  <a
            href="javascript:openUserModifyDialog()" class="easyui-linkbutton"
            iconCls="icon-edit" plain="true">修改</a> --%>
        <a
            href="javascript:deleteUser()" class="easyui-linkbutton"
            iconCls="icon-remove" plain="true">删除</a>
    </div>
    <div>
        &nbsp;模板名：&nbsp;<input type="text" id="s_userName" size="20"
                               onkeydown="if(event.keyCode==13) searchUser()"/> <a
            href="javascript:searchUser()" class="easyui-linkbutton"
            iconCls="icon-search" plain="true">搜索</a>
    </div>
</div>



<div id="dlg" class="easyui-dialog"
     style="width: 1020px;height:650px;padding: 10px 20px" closed="true"
     buttons="#dlg-buttons">
    <form id="fm" method="post">
        <tr>
            <td>模板名称：<input type="text" id="template.name" name="name"
                            class="easyui-validatebox" required="true"/>&nbsp;<font
                    color="red">*</font>
            </td>
        </tr>
        </br>    </br>    </br>


        <table cellspacing="3px" border="0">
            <tr>
                <td>颜色级升贴水：</td>
            </tr>
            <tr>
                <td>白棉1:</td>
                <td><input type="text" id="ratioStrategy.colourW1" name="ratioStrategyVo.colourW1"/></td>
                <td>白棉2:</td>
                <td><input type="text" id="ratioStrategy.colourW2" name="ratioStrategyVo.colourW2"/></td>
                <td>白棉3:</td>
                <td><input type="text" id="ratioStrategy.colourW3" name="ratioStrategyVo.colourW3"/></td>
            </tr>
            <tr>
                <td>白棉4:</td>
                <td><input type="text" id="ratioStrategy.colourW4" name="ratioStrategyVo.colourW4"/></td>
                <td>白棉5:</td>
                <td><input type="text" id="ratioStrategy.colourW5" name="ratioStrategyVo.colourW5"/></td>
            </tr>
            <tr>
                <td>淡棉1:</td>
                <td><input type="text" id="ratioStrategy.colourL1" name="ratioStrategyVo.colourL1"/></td>
                <td>淡棉2:</td>
                <td><input type="text" id="ratioStrategy.colourL2" name="ratioStrategyVo.colourL2"/></td>
                <td>淡棉3:</td>
                <td><input type="text" id="ratioStrategy.colourL3" name="ratioStrategyVo.colourL3"/></td>
            </tr>
            <tr>
                <td>淡黄1:</td>
                <td><input type="text" id="ratioStrategy.colourLy1" name="ratioStrategyVo.colourLy1"/></td>
                <td>淡黄2:</td>
                <td><input type="text" id="ratioStrategy.colourLy2" name="ratioStrategyVo.colourLy2"/></td>
                <td>淡黄3:</td>
                <td><input type="text" id="ratioStrategy.colourLy3" name="ratioStrategyVo.colourLy3"/></td>
            </tr>
            <tr>
                <td>黄染1:</td>
                <td><input type="text" id="ratioStrategy.colourY1" name="ratioStrategyVo.colourY1"/></td>
                <td>黄染2:</td>
                <td><input type="text" id="ratioStrategy.colourY2" name="ratioStrategyVo.colourY2"/></td>
            </tr>
        </table>
        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>轧工升贴水：</td>
            </tr>
            <tr>
                <td>P1:</td>
                <td><input type="text" id="ratioStrategy.ginningP1" name="ratioStrategyVo.ginningP1"/></td>
                <td>P2:</td>
                <td><input type="text" id="ratioStrategy.ginningP2" name="ratioStrategyVo.ginningP2"/></td>
                <td>P3:</td>
                <td><input type="text" id="ratioStrategy.ginningP3" name="ratioStrategyVo.ginningP3"/></td>
            </tr>
        </table>
        </br>


        <c:set var="allIndex" value="0" />

        <table cellspacing="3px" border="0">
            <tr>
                <td>长度区间策略</td>
            </tr>
            <c:forEach begin="1" end="10" step="1" var="i">
                <tr>
                    <td>区间${i}：</td>
                    <td>最小值:</td>
                    <td><input type="text" id="min" name="rangeStrategyVoList[${allIndex}].min"/></td>
                    <td>最大值:</td>
                    <td><input type="text" id="max" name="rangeStrategyVoList[${allIndex}].max"/></td>
                    <td>价格:</td>
                    <td><input type="text" id="price" name="rangeStrategyVoList[${allIndex}].price"/></td>
                    <td><input type="hidden" id="type" name="rangeStrategyVoList[${allIndex}].type"   value="1" /></td>
                </tr>
                <c:set var="allIndex" value="${allIndex+1}" />
            </c:forEach>
        </table>

        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>马克隆区间策略</td>
            </tr>
            <c:forEach begin="1" end="10" step="1" var="i">
                <tr>
                    <td>区间${i}：</td>
                    <td>最小值:</td>
                    <td><input type="text" id="min" name="rangeStrategyVoList[${allIndex}].min"/></td>
                    <td>最大值:</td>
                    <td><input type="text" id="max" name="rangeStrategyVoList[${allIndex}].max"/></td>
                    <td>价格:</td>
                    <td><input type="text" id="price" name="rangeStrategyVoList[${allIndex}].price"/></td>
                    <td><input type="hidden" id="type" name="rangeStrategyVoList[${allIndex}].type"   value="2" /></td>
                </tr>
                <c:set var="allIndex" value="${allIndex+1}" />
            </c:forEach>
        </table>

        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>长整区间策略</td>
            </tr>
            <c:forEach begin="1" end="10" step="1" var="i">
                <tr>
                    <td>区间${i}：</td>
                    <td>最小值:</td>
                    <td><input type="text" id="min" name="rangeStrategyVoList[${allIndex}].min"/></td>
                    <td>最大值:</td>
                    <td><input type="text" id="max" name="rangeStrategyVoList[${allIndex}].max"/></td>
                    <td>价格:</td>
                    <td><input type="text" id="price" name="rangeStrategyVoList[${allIndex}].price"/></td>
                    <td><input type="hidden" id="type" name="rangeStrategyVoList[${allIndex}].type"   value="3" /></td>
                </tr>
                <c:set var="allIndex" value="${allIndex+1}" />
            </c:forEach>
        </table>


        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>强度区间策略</td>
            </tr>
            <c:forEach begin="1" end="10" step="1" var="i">
                <tr>
                    <td>区间${i}：</td>
                    <td>最小值:</td>
                    <td><input type="text" id="min" name="rangeStrategyVoList[${allIndex}].min"/></td>
                    <td>最大值:</td>
                    <td><input type="text" id="max" name="rangeStrategyVoList[${allIndex}].max"/></td>
                    <td>价格:</td>
                    <td><input type="text" id="price" name="rangeStrategyVoList[${allIndex}].price"/></td>
                    <td><input type="hidden" id="type" name="rangeStrategyVoList[${allIndex}].type"   value="4" /></td>
                </tr>
                <c:set var="allIndex" value="${allIndex+1}" />
            </c:forEach>
        </table>



        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>含杂区间策略</td>
            </tr>
            <c:forEach begin="1" end="10" step="1" var="i">
                <tr>
                    <td>区间${i}：</td>
                    <td>最小值:</td>
                    <td><input type="text" id="min" name="rangeStrategyVoList[${allIndex}].min"/></td>
                    <td>最大值:</td>
                    <td><input type="text" id="max" name="rangeStrategyVoList[${allIndex}].max"/></td>
                    <td>价格:</td>
                    <td><input type="text" id="price" name="rangeStrategyVoList[${allIndex}].price"/></td>
                    <td><input type="hidden" id="type" name="rangeStrategyVoList[${allIndex}].type"   value="5" /></td>
                </tr>
                <c:set var="allIndex" value="${allIndex+1}" />
            </c:forEach>
        </table>


        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>回潮区间策略</td>
            </tr>
            <c:forEach begin="1" end="10" step="1" var="i">
                <tr>
                    <td>区间${i}：</td>
                    <td>最小值:</td>
                    <td><input type="text" id="min" name="rangeStrategyVoList[${allIndex}].min"/></td>
                    <td>最大值:</td>
                    <td><input type="text" id="max" name="rangeStrategyVoList[${allIndex}].max"/></td>
                    <td>价格:</td>
                    <td><input type="text" id="price" name="rangeStrategyVoList[${allIndex}].price"/></td>
                    <td><input type="hidden" id="type" name="rangeStrategyVoList[${allIndex}].type"   value="6" /></td>
                </tr>
                <c:set var="allIndex" value="${allIndex+1}" />
            </c:forEach>
        </table>

    </form>


</div>

<div id="dlg-buttons">
    <a href="javascript:saveUser()" class="easyui-linkbutton"
       iconCls="icon-ok">保存</a> <a href="javascript:closeUserDialog()"
                                   class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
</div>




<div id="dlg_c" class="easyui-dialog"
     style="width: 300px;height:450px;padding: 10px 20px; position: relative; z-index:1000;"
     closed="true" buttons="#dlg_c-buttons">
    <form id="fm_c" method="post">
        <table cellspacing="8px" id="tab">
        </table>
    </form>
</div>

</body>
<script type="text/javascript">
    var url;

    function searchBook() {
        $("#dg").datagrid('load', {
            "title": $("#biaoti").val(),
            "author": $("#zuozhe").val(),
            "isbn": $("#bianma").val(),
        });
    }


    function openbookInfoPage(id) {
        window.parent.openTab('书籍摆放信息', 'storeInfo.jsp?id=' + id,
            'icon-shujias');
    }

    function formatProPic(val, row) {
        return "<img width=80 height=110 src='../" + val + "'>";
    }
    function formatStatus(val, row) {
        if (row.status == 1)
            return "<div style='color:red;'>已上架</div>";
        else
            return "<div style='color:gray;'>未上架</div>";
    }


    function formatHref(val, row) {
        return "<a href='${pageContext.request.contextPath}/template/show.do?id=" + row.id + "' >查看详情修改</a>";
    }

</script>
</html>