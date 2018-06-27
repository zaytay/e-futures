<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>批量计算</title>
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
    <script type="text/javascript">
        var url;
        function addTab(url, text, iconCls) {
            var content = "<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src='${pageContext.request.contextPath}/views/"
                + url + "'></iframe>";
            $("#tabs").tabs("add", {
                title: text,
                iconCls: iconCls,
                closable: true,
                content: content
            });
        }
        function openTab(text, url, iconCls) {
            if ($("#tabs").tabs("exists", text)) {
                $("#tabs").tabs("close", text);
                addTab(url, text, iconCls);
                $("#tabs").tabs("select", text);
            } else {
                addTab(url, text, iconCls);
            }
        }

        function logout() {
            $.messager
                .confirm(
                    "系统提示",
                    "您确定要退出系统吗",
                    function (r) {
                        if (r) {
                            window.location.href = "${pageContext.request.contextPath}/user/logout.do";
                        }
                    });
        }
    </script>
    <jsp:include page="../../../login_chk.jsp"></jsp:include>
<body class="easyui-layout">
<div>
    <h2>下载批量文件模板</h2>
    <form action="${pageContext.request.contextPath}/compute/downloadPattern.do" enctype="multipart/form-data" method="post">
        <input type="submit" value="下载Excel"></input>
    </form>

    <br/>
    <br/>

    <h2>上传文件并计算</h2>
    <form action="${pageContext.request.contextPath}/compute/upload.do" enctype="multipart/form-data" method="post">
        <input type="file" name="file"></input>

        <h5>选择模板</h5>
        <select name="templateId"  id="templateId">
            <c:forEach  items="${cottonTemplateList}" var="template">
                <option value="${template.id}" >${template.name}</option>
            </c:forEach>
        </select>

        <input type="submit" value="提交计算"></input>
    </form>

    <c:if test="${not empty resultUrl}">
        <h3>计算结果下载</h3>
        <form action="${pageContext.request.contextPath}/compute/downloadResult.do" enctype="multipart/form-data" method="post">
            <input type="file" name="file">${resultUrl}</input>
            <input type="submit" value="下载结果"></input>
        </form>
    </c:if>

</div>


</body>
</html>
