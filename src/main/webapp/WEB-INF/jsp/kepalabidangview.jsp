<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Kepala Bidang</h1>

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
	<c:forEach items="${kepalabidangs}" var="kepalabidang">
			<c:url var="editUrl" value="kepalabidangedit.htm?noPermintaan=${kepalabidang.noPermintaan}" />
		<tr>
			<td><c:out value="${kepalabidang.noPermintaan}" /></td>
			<td><c:out value="${kepalabidang.pemohon}" /></td>
			<td><c:out value="${kepalabidang.nama}" /></td>
			<td><c:out value="${kepalabidang.jenisKelamin}" /></td>
			<td><c:out value="${kepalabidang.noKtp}" /></td>
			<td><c:out value="${kepalabidang.tanggalTerima}" /></td>
			<td><c:out value="${kepalabidang.telepon}" /></td>
			<td><c:out value="${kepalabidang.jumlahIzinBelumVerifikasi}" /></td>
			<td><c:out value="${kepalabidang.alamat}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
