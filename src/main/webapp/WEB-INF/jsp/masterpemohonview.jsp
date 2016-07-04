<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="${addLink}">Daftar Pemohon Baru</a></h1>


<tg:usermessage></tg:usermessage>

<div style="width: 98%">
	<tg:paging pagingRecord="${pagingRecord}" />
</div>

<table id="viewtable" style="border: 1px solid; width: 98%; text-align: center;">
	<thead style="background: #d7e9f5; font-weight: bold;">
		<tr>
			<th>Id Pemohon</th>
			<th>Badan Usaha</th>
			<th>Nama Usaha</th>
			<th>Jenis Pemohon</th>
			<th>Nama Pemohon</th>
			<th>Jenis Kelamin</th>
			<th>Alamat</th>
		</tr>
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${not empty pagingRecord.records}">
		<c:forEach items="${pagingRecord.records}" var="masterpemohon">
				<tr>
					<td><a href="${editLink}?idPemohon=${masterpemohon.idPemohon}"><c:out value="${masterpemohon.idPemohon}"/></a></td>
					<td><c:out value="${masterpemohon.badanUsaha}" /></td>
					<td><c:out value="${masterpemohon.namaUsaha}" /></td>
					<td><c:out value="${masterpemohon.jenisPemohon}" /></td>
					<td><c:out value="${masterpemohon.namaPemohon}" /></td>
					<td><c:out value="${masterpemohon.jenisKelamin}" /></td>
					<td><c:out value="${masterpemohon.alamat}" /></td>
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
