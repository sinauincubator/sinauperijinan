<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="/sinauperijinan/styles/common/contentstyle.css" rel="stylesheet" type="text/css" />

<c:if test="${not empty status && not empty message}">
	<c:if test="${status == 'Success'}">
		<div class="userMessage" >
			<span class="userMessageTitleSuccess"><b>${status}:</b> ${message}</span>
		</div>
	</c:if>
	<c:if test="${status == 'Failed'}">
		<div class="userMessage" >
			<span class="userMessageTitleFailed"><b>${status}:</b> ${message}</span>
		</div>
	</c:if>
</c:if>

