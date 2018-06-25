<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>棉花模板修改</title>
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
    <jsp:include page="login_chk.jsp"></jsp:include>
<body class="easyui-layout">
<div region="north" style="height: 78px;background-color: #ffff">
    <table width="100%">
        <tr>
            <td width="50%"></td>
            <td valign="bottom"
                style="font-size: 20px;color:#8B8B8B;font-family: '楷体';"
                align="right" width="50%"><font size="3">&nbsp;&nbsp;<strong>当前管理员：</strong>${currentUser.userName
                    }</font>【管理员】
            </td>
        </tr>
    </table>
</div>
test: ${test}
<%@include file="/WEB-INF/jsp/template/templateUpdate.jsp" %>
<%--
<div region="center">
    <div class="easyui-tabs" fit="true" border="false" id="tabs">
        <div title="首页" data-options="iconCls:'icon-home'">
            <!-- <div align="center" style="padding-top: 20px;"><a
                    href="https://git.oschina.net/zhenfeng13/ssm-demo"
                    target="_blank" style="font-size: 20px;">开源中国仓库地址</a>
            </div>
            <div align="center" style="padding-top: 20px;"><a href="https://github.com/ZHENFENG13/ssm-demo"
                                                              target="_blank"
                                                              style="font-size: 20px;">Gitub仓库地址</a></div>

            <div align="center" style="padding-top: 50px;"><a
                    href="http://download.csdn.net/detail/zhenfengshisan/9813721"
                    target="_blank" style="font-size: 20px;">项目源码下载(最新代码)</a>
            </div>
            <div align="center" style="padding-top: 20px;"><a
                    href="http://download.csdn.net/detail/zhenfengshisan/9765855"
                    target="_blank" style="font-size: 20px;">项目源码下载(非maven)</a>
            </div> -->
            <div align="center" style="padding-top: 50px">
                <font color="grey" size="10">棉花期货web-demo</font>
            </div>


            <form method="post" action="/cpc/query">
                <table border="0"   >

                    <tr >
                        <td>棉花期货单号：</td>
                        <td><input id="keyword" type="text" name="keyword" value="${keyword}"></td>
                        <td>    <input type="submit" value="查询"/> </td>

                    </tr>

                </table>
            </form>

            <br/>
            <br/>





            <table border="2">
                <thead>
                <tr>
                    <th>批号</th>
                    <th>类型</th>
                    <th>加工单位</th>
                    <th>件数</th>
                    <th>价格</th>
                    <th>重量</th>
                    <th>颜色级</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach  var="i"  begin="1"  end="9" step="1">
                    <tr>
                        <th>${i}</th>
                        <th>手摘</th>
                        <th>河南棉花基地</th>
                        <th>120</th>
                        <th>10000</th>
                        <th>
                            27.396
                        </th>
                        <th>
                            黄染棉1级
                        </th>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
            <%@include file="/WEB-INF/jsp/common/page.jsp" %>


        </div>
    </div>
</div>
--%>
<div region="west" style="width: 200px;height:500px;" title="导航菜单"
     split="true">
    <div class="easyui-accordion">
        <div title="模板修改"
             data-options="selected:true,iconCls:'icon-wenzhangs'"
             style="padding: 10px;height:10px;">
<%--            <a
                    href="javascript:openTab(' 文章管理','articleManage.jsp','icon-wenzhang')"
                    class="easyui-linkbutton"
                    data-options="plain:true,iconCls:'icon-wenzhang'"
                    style="width: 150px;"> 文章管理</a>--%>
        </div>
        <div title="图片管理" data-options="iconCls:'icon-shouye'"
             style="padding:10px">
            <a
                    href="javascript:openTab(' 图片设置','pictureManage.jsp?type=1&grade=1','icon-tupians')"
                    class="easyui-linkbutton"
                    data-options="plain:true,iconCls:'icon-tupian'"
                    style="width: 150px;"> 图片设置</a>
        </div>
        <div title="书籍管理" data-options="iconCls:'icon-shuji'"
             style="padding:10px">
            <a
                    href="javascript:openTab(' 全部书籍','allBooksManage.jsp','icon-shuben')"
                    class="easyui-linkbutton"
                    data-options="plain:true,iconCls:'icon-shuben'"
                    style="width: 150px;">全部书籍</a>
        </div>
        <div title="模板管理" data-options="iconCls:'icon-shuji'"
             style="padding:10px">
            <a
                    href="javascript:openTab(' 全部模板','cottonTemplate.jsp','icon-shuben')"
                    class="easyui-linkbutton"
                    data-options="plain:true,iconCls:'icon-shuben'"
                    style="width: 150px;">全部模板</a>
        </div>
        <div title="用户管理" data-options="iconCls:'icon-item'"
             style="padding:10px;border:none;">
            <a href="javascript:openTab(' 管理员列表','userManage.jsp','icon-lxr')"
               class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-lxr'" style="width: 150px;">
                管理员列表</a>


            <a href="javascript:logout()"
                            class="easyui-linkbutton"
                            data-options="plain:true,iconCls:'icon-exit'"
                            style="width: 150px;">
            安全退出</a>
        </div>
    </div>
</div>
</body>
</html>
