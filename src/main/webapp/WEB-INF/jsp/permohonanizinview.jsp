<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Permohonan Izin</h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<th>Nomor Permintaan</th>
			<th>Nama Pemohon</th>
			<th>ID Pemohon</th>
			<th>Nama Perusahaan</th>
			<th>Izin</th>
			<th>No Izin</th>
			<th>Status</th>
			<th>Proses Selanjutnya</th>
			<th>Tanggal Input</th>
			<th>Tanggal Selesai</th>
			<th>Entry Oleh</th>

			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${permohonanizins}" var="permohonanizin">
		<tr>
			<td><c:out value="${permohonanizin.nomorPermintaan}" /></td>
			<td><c:out value="${permohonanizin.namaPemohon}" /></td>
			<td><c:out value="${permohonanizin.idPemohon}" /></td>
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
	</tbody>
</table>
</body>
</html>
