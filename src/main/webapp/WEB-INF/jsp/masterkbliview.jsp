<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="masterkbliadd.htm">Daftar KBLI Baru</a></h1>

<c:url value="masterkbliview.htm" var="pagedLink"></c:url>
<div style="width: 98%">
	<tg:paging pagingRecord="${pagingRecord}" pagedLink="${pagedLink}"/>
</div>

<table style="border: 1px solid; width: 98%; text-align: center;">
	<thead style="background:#bbbbff; font-weight: bold;">
		<tr>
			<td>KBLI</td>
			<td>Deskripsi</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${pagingRecord.records}" var="masterkbli">
			<c:url var="editUrl" value="masterkbliedit.htm?id=${masterkbli.id}" />
		<tr>
			<td><a href="${editUrl}"><c:out value="${masterkbli.kodeKbli}" /></a></td>
			<td><c:out value="${masterkbli.deskripsi}" /></td>
		</tr>
	</c:forEach>
	</tbody>
</table>

<script>
	$( "tr:odd" ).css( "background-color", "#f2f2f2" );
</script>

</body>
</html>
