<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="${addLink}">Tambah Permohonan Izin</a></h1>

<tg:usermessage></tg:usermessage>

<div style="width: 98%">
	<tg:paging pagingRecord="${pagingRecord}" />
</div>

<table id="viewtable" style="border: 1px solid; width: 98%; text-align: center;">
	<thead style="background:#d7e9f5; font-weight: bold;">
		<tr>
			<td>Nomor Permintaan</td>
			<td>Nama Pemohon</td>
			<td>ID Pemohon</td>
			<td>Nama Perusahaan</td>
			<td>Izin</td>
			<td>No Izin</td>
			<td>Status</td>
			<td>Proses Selanjutnya</td>
			<td>Tanggal Input</td>
			<td>Tanggal Selesai</td>
			<td>Entry Oleh</td>

			<td></td>
		</tr>
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${not empty pagingRecord.records}">
			<c:forEach items="${pagingRecord.records}" var="permohonanIzin">
			<tr>
			<td><a href="${editLink}?idPemohon=${permohonanIzin.idPemohon}"><c:out value="${permohonanIzin.nomorPermintaan}" /></a></td>
			<td><c:out value="${permohonanizin.namaPemohon}" /></td>
			<td><c:out value="${permohonanizin.namaPerusahaan}" /></td>
			<td><c:out value="${permohonanizin.izin}" /></td>
			<td><c:out value="${permohonanizin.noIzin}" /></td>
			<td><c:out value="${permohonanizin.status}" /></td>
			<td><c:out value="${permohonanizin.prosesSelanjutnya}" /></td>
			<td><c:out value="${permohonanizin.tglInput}" /></td>
			<td><c:out value="${permohonanizin.tglSelesai}" /></td>
			<td><c:out value="${permohonanizin.entryOleh}" /></td>
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
