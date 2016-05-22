<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Administrasi</h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<th>No Permintaan</th>
			<th>Pemohon</th>
			<th>Nama</th>
			<th>Jenis Kelamin</th>
			<th>No KTP</th>
			<th>Tanggal Terima</th>
			<th>Telepon</th>
			<th>Jumlah Izin Belum Verifikasi</th>
			<th>Alamat</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${administrasis}" var="administrasi">
			<c:url var="editUrl" value="administrasiedit.htm?noPermintaan=${administrasi.noPermintaan}" />
		<tr>
			<td><c:out value="${administrasi.noPermintaan}" /></td>
			<td><c:out value="${administrasi.pemohon}" /></td>
			<td><c:out value="${administrasi.nama}" /></td>
			<td><c:out value="${administrasi.jenisKelamin}" /></td>
			<td><c:out value="${administrasi.noKtp}" /></td>
			<td><c:out value="${administrasi.tanggalTerima}" /></td>
			<td><c:out value="${administrasi.telepon}" /></td>
			<td><c:out value="${administrasi.jumlahIzinBelumVerifikasi}" /></td>
			<td><c:out value="${administrasi.alamat}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
