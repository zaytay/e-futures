<%--
  Created by IntelliJ IDEA.
  User: zaytay
  Date: 2018/5/12
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
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

            <c:if test="${not empty page.result}">
                <table border="2">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>批号</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${page.result}" var="result">
                        <tr>
                            <th>${result.id}</th>
                            <th>${result.productionCode}</th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>



<%--
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
--%>
            <%@include file="/WEB-INF/jsp/common/page.jsp" %>


        </div>
    </div>
</div>
