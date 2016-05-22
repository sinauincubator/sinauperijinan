<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Proses Izin Kepala Seksi</h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<th>No</th>
			<th>Nomor Permintaan</th>
			<th>Pemohon</th>
			<th>Nama</th>
			<th>Jenis Kelamin</th>
			<th>Nomor KTP</th>
			<th>Tanggal Terima</th>
			<th>Telepon</th>
			<th>Jumlah Izin Belum Survey</th>
			<th>Alamat</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${kepalaseksis}" var="kepalaseksi">
			<c:url var="editUrl" value="kepalaseksiedit.htm?noPermintaan=${kepalaseksi.noPermintaan}" />
		<tr>
			<td><c:out value="${kepalaseksi.noPermintaan}" /></td>
			<td><c:out value="${kepalaseksi.pemohon}" /></td>
			<td><c:out value="${kepalaseksi.nama}" /></td>
			<td><c:out value="${kepalaseksi.jenisKelamin}" /></td>
			<td><c:out value="${kepalaseksi.noKtp}" /></td>
			<td><c:out value="${kepalaseksi.tanggalTerima}" /></td>
			<td><c:out value="${kepalaseksi.telepon}" /></td>
			<td><c:out value="${kepalaseksi.jumlahIzinBelumVerifikasi}" /></td>
			<td><c:out value="${kepalaseksi.alamat}" /></td>

			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
