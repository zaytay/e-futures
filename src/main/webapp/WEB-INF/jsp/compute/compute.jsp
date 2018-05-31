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

            <div align="center" style="padding-top: 50px">
                <font color="grey" size="10">计算中心demo</font>
            </div>

            <form method="post" action="/compute/cottonPrice.do">
                <table border="0"   >

                    <tr >
                        <td>棉花期货单号：</td>
                        <td><input id="code" type="text" name="code" value="${code}"></td>
                    </tr>
                    <tr >
                        <td>计算模板ID：</td>
                        <td><input id="templateId" type="text" name="templateId" value="${templateId}"></td>
                    </tr>
                    <tr >
                        <td>    <input type="submit" value="计算"/> </td>
                    </tr>

                    <tr >
                        <td>最终价格：</td>
                        <td><input id="price" type="text" name="price" value="${price}"></td>
                    </tr>

                </table>
            </form>

            <br/>
            <br/>

        </div>
    </div>
</div>
