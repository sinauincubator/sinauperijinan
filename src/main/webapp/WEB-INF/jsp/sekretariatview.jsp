<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Sekretariat</h1>

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
	<c:forEach items="${sekretariats}" var="sekretariat">
			<c:url var="editUrl" value="sekretariatedit.htm?noPermintaan=${sekretariat.noPermintaan}" />
		<tr>
			<td><c:out value="${sekretariat.noPermintaan}" /></td>
			<td><c:out value="${sekretariat.pemohon}" /></td>
			<td><c:out value="${sekretariat.nama}" /></td>
			<td><c:out value="${sekretariat.jenisKelamin}" /></td>
			<td><c:out value="${sekretariat.noKtp}" /></td>
			<td><c:out value="${sekretariat.tanggalTerima}" /></td>
			<td><c:out value="${sekretariat.telepon}" /></td>
			<td><c:out value="${sekretariat.jumlahIzinBelumVerifikasi}" /></td>
			<td><c:out value="${sekretariat.alamat}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
