<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
<head>
<link href="/sinauperijinan/styles/common/contentsearchstyle.css" rel="stylesheet" type="text/css" />

<title>Insert title here</title>
</head>
<body>
<h1><a href="${addLink}">Master KBLI</a></h1>

<tg:usermessage></tg:usermessage>

<form:form modelAttribute="masterKbliAttribute" method="POST" action="${viewLink}">
	<div class="searchCriteria" >
		<table class="searchCriteriaField">
			<tbody>
				<tr>
					<td>Search Method</td>
					<td>:</td>
					<td><form:input path="searchMethod" cssStyle="width:75%"/></td>
				</tr>
				<tr>
					<td>Kode KBLI</td>
					<td>:</td>
					<td><form:input path="kodeKbli" cssStyle="width:75%"/></td>
				</tr>
				<tr>
					<td>Deskripsi</td>
					<td>:</td>
					<td><form:input path="deskripsi" cssStyle="width:75%"/></td>
				</tr>
				<tr>					
					<td>&nbsp;</td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td>
						<input id="submit" type="submit" value="Search" style="width: 8em;"/>
						&nbsp; &nbsp;
						<input type="button" onclick="${addLink}" value="Add New KBLI" style="width: 8em;"/>
					</td>
				</tr>				
			</tbody>
		</table>
	</div>
</form:form>

<div style="width: 98%">
	<tg:paging pagingRecord="${pagingRecord}" />
</div>

<table id="viewtable" style="border: 1px solid; width: 98%; text-align: center;">
	<thead style="background: #d7e9f5; font-weight: bold;">		
		<tr>
			<td>KBLI</td>
			<td>Deskripsi</td>
		</tr>
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${not empty pagingRecord.records}">
			<c:forEach items="${pagingRecord.records}" var="masterkbli">
				<tr>
					<td><a href="${editLink}?id=${masterkbli.id}"><c:out value="${masterkbli.kodeKbli}" /></a></td>
					<td><c:out value="${masterkbli.deskripsi}" /></td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<tr>
				<td colspan="2">No Records Found.</td>
			</tr>
		</c:otherwise>
	</c:choose>
	</tbody>
</table>

<tg:bodyfooter></tg:bodyfooter>

<script>
	$("#viewtable > tbody > tr:odd").css("background-color", "#f2f2f2");
</script>

</body>
</html>
