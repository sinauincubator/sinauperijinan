<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="${addLink}">Daftar Izin Baru</a></h1>

<tg:usermessage></tg:usermessage>

<div style="width: 98%">
	<tg:paging pagingRecord="${pagingRecord}" />
</div>

<table id="viewtable" style="border: 1px solid; width: 98%; text-align: center;">
	<thead style="background: #d7e9f5; font-weight: bold;">
		<tr>
			<th>Kode Izin</th>
			<th>Jenis</th>
			<th>Izin</th>
			<th>Dasar</th>
			<th>Peraturan</th>
			<th>KPI</th>
			<th>Aktif</th>
		</tr>
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${not empty pagingRecord.records}">
		<c:forEach items="${pagingRecord.records}" var="masterizin">
				<tr>
					<td><a href="${editLink}?kodeIzin=${masterizin.kodeIzin}"><c:out value="${masterizin.kodeIzin}" /></a></td>
					<td><c:out value="${masterizin.jenis}" /></td>
					<td><c:out value="${masterizin.izin}" /></td>
					<td><c:out value="${masterizin.dasar}" /></td>
					<td><c:out value="${masterizin.peraturan}" /></td>
					<td><c:out value="${masterizin.kpi}" /></td>
					<td><c:out value="${masterizin.aktif}" /></td>
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

</tbody>

</body>
</html>
