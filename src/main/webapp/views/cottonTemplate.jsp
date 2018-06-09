<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <td>长度区间策略</td>
            </tr>
            <tr>
                <td>区间1：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[0].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[0].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[0].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[0].type"   value="1" /></td>
            </tr>





            <tr>
                <td>区间2：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[1].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[1].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[1].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[1].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间3：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[2].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[2].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[2].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[2].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间4：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[3].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[3].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[3].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[3].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间5：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[4].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[4].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[4].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[4].type"   value="1" /></td>
            </tr>
        </table>

        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>马克隆区间策略</td>
            </tr>
            <tr>
                <td>区间1：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[5].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[5].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[5].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[5].type"   value="1" /></td>
            </tr>





            <tr>
                <td>区间2：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[6].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[6].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[6].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[6].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间3：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[7].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[7].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[7].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[7].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间4：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[8].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[8].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[8].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[8].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间5：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[9].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[9].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[9].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[9].type"   value="1" /></td>
            </tr>
        </table>

        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>长整区间策略</td>
            </tr>
            <tr>
                <td>区间1：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[10].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[10].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[10].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[10].type"   value="1" /></td>
            </tr>

            <tr>
                <td>区间2：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[11].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[11].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[11].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[11].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间3：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[12].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[12].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[12].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[12].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间4：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[13].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[13].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[13].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[13].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间5：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[14].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[14].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[14].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[14].type"   value="1" /></td>
            </tr>
        </table>


        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>强度区间策略</td>
            </tr>
            <tr>
                <td>区间1：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[15].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[15].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[15].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[15].type"   value="1" /></td>
            </tr>

            <tr>
                <td>区间2：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[16].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[16].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[16].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[16].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间3：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[17].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[17].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[17].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[17].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间4：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[18].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[18].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[18].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[18].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间5：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[19].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[19].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[19].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[19].type"   value="1" /></td>
            </tr>
        </table>



        </br>

        <table cellspacing="3px" border="0">
            <tr>
                <td>含杂区间策略</td>
            </tr>
            <tr>
                <td>区间1：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[20].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[20].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[20].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[20].type"   value="1" /></td>
            </tr>

            <tr>
                <td>区间2：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[21].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[21].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[21].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[21].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间3：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[22].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[22].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[22].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[22].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间4：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[23].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[23].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[23].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[23].type"   value="1" /></td>
            </tr>
            <tr>
                <td>区间5：</td>
                <td>最小值:</td>
                <td><input type="text" id="min" name="rangeStrategyVoList[24].min"/></td>
                <td>最大值:</td>
                <td><input type="text" id="max" name="rangeStrategyVoList[24].max"/></td>
                <td>价格:</td>
                <td><input type="text" id="price" name="rangeStrategyVoList[24].price"/></td>
                <td><input type="hidden" id="type" name="rangeStrategyVoList[24].type"   value="1" /></td>
            </tr>
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