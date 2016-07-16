<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="${addLink}">Tambah Monitoring</a></h1>

<tg:usermessage></tg:usermessage>

<div style="width: 98%">
	<tg:paging pagingRecord="${pagingRecord}" />
</div>

<table id="viewtable" style="border: 1px solid; width: 98%; text-align: center;">
	<thead style="background:#d7e9f5; font-weight: bold;">
		<tr>
            <td>Pengesahan</td>
            <td>No Permintaan</td>
            <td>Kode Izin</td>
            <td>Jenis</td>
            <td>Nomor Izin</td>
            <td>Aging(Hari)</td>
			<td></td>
		</tr>
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${not empty pagingRecord.records}">
			<c:forEach items="${pagingRecord.records}" var="monitoring">
				<tr>
				<td><a href="${editLink}?id=${monitoring.id}"><c:out value="${monitoring.pengesahan}" /></a></td>
				<td><c:out value="${monitoring.noPermintaan}" /></td>
				<td><c:out value="${monitoring.kodeIzin}" /></td>
				<td><c:out value="${monitoring.jenis}" /></td>
				<td><c:out value="${monitoring.nomorIzin}" /></td>
				<td><c:out value="${monitoring.aging}" /></td>
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
