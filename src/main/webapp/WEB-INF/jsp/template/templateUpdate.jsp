<%--
  Created by IntelliJ IDEA.
  User: zhengxuetong
  Date: 2018/6/9
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<div region="center">
    <div title="模板修改页面" data-options="iconCls:'icon-home'">

        <div align="center" style="padding-top: 50px">
            <font color="grey" size="10">模板修改页面</font>
        </div>

        <form method="post" action="/template/update.do">
            <tr >
                <td>
                    <input id="id" type="hidden" name="id" value="${id}">
                </td>
            </tr>
            <tr >
                <td>模板名称：</td>
                <td><input id="template_name" type="text" name="name" value="${name}"></td>
            </tr>
            <br/>
            <br/>
            <br/>
            <c:set var="strategyIndex" value="0" />
            <table border="0"   >
                <tr>
                    <td>长度区间策略</td>
                </tr>
                <c:set var="supplement" value="5" />
                <c:forEach items="${lengthStrategies}" var="item" varStatus="status">
                    <tr>
                        <td>区间：${status.index}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  value="${item.min}"/></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  value="${item.max}"/></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price" value="${item.price}" /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="1" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                    <c:set var="supplement" value="${supplement-1}" />
                </c:forEach>
                <c:forEach  var="item" begin="1"  end="${supplement}" step="1">
                    <tr>
                        <td>区间：${strategyIndex}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  /></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  /></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price"  /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="1" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                </c:forEach>
            </table>




            <br/>
            <br/>
            <br/>
            <table border="0"   >
                <tr>
                    <td>马克隆区间策略</td>
                </tr>
                <c:set var="supplement" value="5" />
                <c:forEach items="${micronaireStrategies}" var="item" varStatus="status">
                    <tr>
                        <td>区间：${status.index}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  value="${item.min}"/></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  value="${item.max}"/></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price" value="${item.price}" /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="2" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                    <c:set var="supplement" value="${supplement-1}" />
                </c:forEach>
                <c:forEach  var="item" begin="1"  end="${supplement}" step="1">
                    <tr>
                        <td>区间：${strategyIndex}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  /></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  /></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price"  /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="2" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                </c:forEach>
            </table>



            <br/>
            <br/>
            <br/>
            <table border="0"   >
                <tr>
                    <td>长整区间策略</td>
                </tr>
                <c:set var="supplement" value="5" />
                <c:forEach items="${evennessStrategies}" var="item" varStatus="status">
                    <tr>
                        <td>区间：${status.index}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  value="${item.min}"/></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  value="${item.max}"/></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price" value="${item.price}" /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="3" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                    <c:set var="supplement" value="${supplement-1}" />
                </c:forEach>
                <c:forEach  var="item" begin="1"  end="${supplement}" step="1">
                    <tr>
                        <td>区间：${strategyIndex}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  /></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  /></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price"  /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="3" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                </c:forEach>
            </table>



            <br/>
            <br/>
            <br/>
            <table border="0"   >
                <tr>
                    <td>强度区间策略</td>
                </tr>
                <c:set var="supplement" value="5" />
                <c:forEach items="${strengthStrategies}" var="item" varStatus="status">
                    <tr>
                        <td>区间：${status.index}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  value="${item.min}"/></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  value="${item.max}"/></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price" value="${item.price}" /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="4" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                    <c:set var="supplement" value="${supplement-1}" />
                </c:forEach>
                <c:forEach  var="item" begin="1"  end="${supplement}" step="1">
                    <tr>
                        <td>区间：${strategyIndex}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  /></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  /></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price"  /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="4" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                </c:forEach>
            </table>



            <br/>
            <br/>
            <br/>
            <table border="0"   >
                <tr>
                    <td>含杂区间策略</td>
                </tr>
                <c:set var="supplement" value="5" />
                <c:forEach items="${miscellaneousStrategies}" var="item" varStatus="status">
                    <tr>
                        <td>区间：${status.index}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  value="${item.min}"/></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  value="${item.max}"/></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price" value="${item.price}" /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="5" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                    <c:set var="supplement" value="${supplement-1}" />
                </c:forEach>
                <c:forEach  var="item" begin="1"  end="${supplement}" step="1">
                    <tr>
                        <td>区间：${strategyIndex}</td>
                        <td>最小值:</td>
                        <td><input type="text" id="min" name="rangeStrategyVoList[${strategyIndex}].min"  /></td>
                        <td>最大值:</td>
                        <td><input type="text" id="max" name="rangeStrategyVoList[${strategyIndex}].max"  /></td>
                        <td>价格:</td>
                        <td><input type="text" id="price" name="rangeStrategyVoList[${strategyIndex}].price"  /></td>
                        <td>
                            <input type="hidden" id="type" name="rangeStrategyVoList[${strategyIndex}].type"   value="5" />
                        </td>
                    </tr>
                    <c:set var="strategyIndex" value="${strategyIndex+1}" />
                </c:forEach>
            </table>






            <input type="submit" value="提交修改"/>

        </form>

        <br/>
        <br/>

    </div>
</div>