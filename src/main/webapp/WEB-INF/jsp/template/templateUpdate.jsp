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
            <font color="grey" size="10">模板修改</font>
        </div>

        <form method="post" action="${pageContext.request.contextPath}/template/update.do">
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



            <table >
                <tr>
                    <td >颜色级升贴水:</td>
                </tr>
                <tr>
                    <td>白棉1:</td>
                    <td><input type="text" id="ratioStrategy.colourW1" name="ratioStrategyVo.colourW1"  value="${ratioStrategy.colourW1}"/></td>
                    <td>白棉2:</td>
                    <td><input type="text" id="ratioStrategy.colourW2" name="ratioStrategyVo.colourW2" value="${ratioStrategy.colourW2}"/></td>
                    <td>白棉3:</td>
                    <td><input type="text" id="ratioStrategy.colourW3" name="ratioStrategyVo.colourW3" value="${ratioStrategy.colourW3}"/></td>
                    <td>白棉4:</td>
                    <td><input type="text" id="ratioStrategy.colourW4" name="ratioStrategyVo.colourW4" value="${ratioStrategy.colourW4}"/></td>
                    <td>白棉5:</td>
                    <td><input type="text" id="ratioStrategy.colourW5" name="ratioStrategyVo.colourW5" value="${ratioStrategy.colourW5}"/></td>
                </tr>
                <tr>

                    <td>淡棉1:</td>
                    <td><input type="text" id="ratioStrategy.colourL1" name="ratioStrategyVo.colourL1" value="${ratioStrategy.colourL1}"/></td>
                    <td>淡棉2:</td>
                    <td><input type="text" id="ratioStrategy.colourL2" name="ratioStrategyVo.colourL2" value="${ratioStrategy.colourL2}"/></td>
                    <td>淡棉3:</td>
                    <td><input type="text" id="ratioStrategy.colourL3" name="ratioStrategyVo.colourL3" value="${ratioStrategy.colourL3}"/></td>

                </tr>
                <tr>
                    <td>淡黄1:</td>
                    <td><input type="text" id="ratioStrategy.colourLy1" name="ratioStrategyVo.colourLy1" value="${ratioStrategy.colourLy1}"/></td>
                    <td>淡黄2:</td>
                    <td><input type="text" id="ratioStrategy.colourLy2" name="ratioStrategyVo.colourLy2" value="${ratioStrategy.colourLy2}"/></td>
                    <td>淡黄3:</td>
                    <td><input type="text" id="ratioStrategy.colourLy3" name="ratioStrategyVo.colourLy3" value="${ratioStrategy.colourLy3}"/></td>
                    <td>黄染1:</td>
                    <td><input type="text" id="ratioStrategy.colourY1" name="ratioStrategyVo.colourY1" value="${ratioStrategy.colourY1}"/></td>
                    <td>黄染2:</td>
                    <td><input type="text" id="ratioStrategy.colourY2" name="ratioStrategyVo.colourY2" value="${ratioStrategy.colourY2}"/></td>
                </tr>



            </table>


            </br>

            <table cellspacing="3px" border="0">
                <tr>
                    <td>轧工升贴水：</td>
                </tr>
                <tr>
                    <td>P1:</td>
                    <td><input type="text" id="ratioStrategy.ginningP1" name="ratioStrategyVo.ginningP1" value="${ratioStrategy.ginningP1}"/></td>
                    <td>P2:</td>
                    <td><input type="text" id="ratioStrategy.ginningP2" name="ratioStrategyVo.ginningP2" value="${ratioStrategy.ginningP2}"/></td>
                    <td>P3:</td>
                    <td><input type="text" id="ratioStrategy.ginningP3" name="ratioStrategyVo.ginningP3" value="${ratioStrategy.ginningP3}"/></td>
                </tr>
            </table>
            </br>

            <table border="0"   >

                <tr>
                    <td>长度区间策略</td>
                </tr>
                <c:set var="supplement" value="5" />
                <c:forEach items="${lengthStrategies}" var="item" varStatus="status">
                    <tr>
                        <td>区间:</td>
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
                        <td>区间:</td>
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
                        <td>区间:</td>
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
                        <td>区间:</td>
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
                        <td>区间:</td>
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
                        <td>区间:</td>
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
                        <td>区间:</td>
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
                        <td>区间:</td>
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
            <%--
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
            --%>






            <input type="submit" value="提交修改"/>

        </form>

        <br/>
        <br/>

    </div>
</div>