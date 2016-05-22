<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Kepala Bagian</h1>

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
	<c:forEach items="${kepalabagians}" var="kepalabagian">
			<c:url var="editUrl" value="kepalabagianedit.htm?noPermintaan=${kepalabagian.noPermintaan}" />
		<tr>
			<td><c:out value="${kepalabagian.noPermintaan}" /></td>
			<td><c:out value="${kepalabagian.pemohon}" /></td>
			<td><c:out value="${kepalabagian.nama}" /></td>
			<td><c:out value="${kepalabagian.jenisKelamin}" /></td>
			<td><c:out value="${kepalabagian.noKtp}" /></td>
			<td><c:out value="${kepalabagian.tanggalTerima}" /></td>
			<td><c:out value="${kepalabagian.telepon}" /></td>
			<td><c:out value="${kepalabagian.jumlahIzinBelumVerifikasi}" /></td>
			<td><c:out value="${kepalabagian.alamat}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
