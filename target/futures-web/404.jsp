<%@ page language="java" contentType="text/html; charset=GBK" isErrorPage="true" pageEncoding="GBK"%>
<%response.setStatus(HttpServletResponse.SC_OK);

%>
<%
	/**
	 * ��ҳ�����ڿͻ����ҵ�ҳ���޷��ҵ�������µ��õ�
	 */
	response.setStatus(HttpServletResponse.SC_OK);
%>
<body>
ҳ���޷��ҵ�... <a href="javascript:history.go(-1)">����</a>
<br/>
Ҳ����ҳ�����Ӹ����ˣ��밴 F5 ��ˢ������ҳ�濴�����ر��ǲ˵���
<br/>
<a href="${pageContext.request.contextPath}/user/logout.do">���ص�¼ҳ</a>

</body>