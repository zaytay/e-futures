<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: zhengxuetong
  Date: 2015/10/26
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%--
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
--%>
<div class="pageBox clearfix mt20">
  <p class="page tc">
    <c:if test="${fn:length(page.slider) >= 1}">
      <c:if test="${page.pageNo > 1 }">
        <a class="pagePrev" href="/cpc/query?keyword=${keyword}&pageNo=${page.pageNo <= 1 ? 1 : page.pageNo - 1}&status=${status}&matchType=${matchType}&accountId=${accountId} ">上一页</a>
      </c:if>

      <c:forEach items="${page.slider}" var="pn">
        <c:if test="${pn != page.pageNo }">
          <a href="/cpc/query?keyword=${keyword}&pageNo=${pn}&status=${status}&matchType=${matchType}&accountId=${accountId}">${pn}</a>
        </c:if>
        <c:if test="${pn == page.pageNo }">
          <a href="/cpc/query?keyword=${keyword}&pageNo=${pn}&status=${status}&matchType=${matchType}&accountId=${accountId}" class="on">${pn }</a>
        </c:if>
      </c:forEach>
      <c:if  test="${page.totalPages > fn:length(page.slider)}">
        <span>...</span>
      </c:if>
      <c:if test="${page.pageNo < page.totalPages }">
        <a class="pageNext" href="/cpc/query?keyword=${keyword}&pageNo=${page.pageNo >= page.totalPages ? page.pageNo : page.pageNo + 1}&status=${status}&matchType=${matchType}&accountId=${accountId}">下一页</a>
      </c:if>
    </c:if>
  </p>
</div>
