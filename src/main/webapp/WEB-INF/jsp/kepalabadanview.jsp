<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Kepala Badan</h1>

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
	<c:forEach items="${kepalabadans}" var="kepalabadan">
			<c:url var="editUrl" value="kepalabadanedit.htm?noPermintaan=${kepalabadan.noPermintaan}" />
		<tr>
			<td><c:out value="${kepalabadan.noPermintaan}" /></td>
			<td><c:out value="${kepalabadan.pemohon}" /></td>
			<td><c:out value="${kepalabadan.nama}" /></td>
			<td><c:out value="${kepalabadan.jenisKelamin}" /></td>
			<td><c:out value="${kepalabadan.noKtp}" /></td>
			<td><c:out value="${kepalabadan.tanggalTerima}" /></td>
			<td><c:out value="${kepalabadan.telepon}" /></td>
			<td><c:out value="${kepalabadan.jumlahIzinBelumVerifikasi}" /></td>
			<td><c:out value="${kepalabadan.alamat}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
