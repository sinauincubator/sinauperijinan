<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="privasiadd.htm">Daftar Privasi Baru</a></h1>

<c:url value="privasiview.htm" var="pagedLink"></c:url>
<div style="width: 98%">
	<tg:paging pagingRecord="${pagingRecord}" pagedLink="${pagedLink}"/>
</div>

<table style="border: 1px solid; width: 98%; text-align: center;">
	<thead style="background:#bbbbff; font-weight: bold;">
		<tr>
			<th>Role ID</th>
			<th>Role Name</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${pagingRecord.records}" var="privasi">
			<c:url var="editUrl" value="privasiedit.htm?idPrivasi=${privasi.idPrivasi}" />
		<tr>
			<td><a href="${editUrl}"><c:out value="${privasi.idPrivasi}" /></a></td>
			<td><c:out value="${privasi.roleName}" /></td>
		</tr>
	</c:forEach>
	</tbody>
</table>

<script>
	$( "tr:odd" ).css( "background-color", "#f2f2f2" );
</script>

</body>
</html>
