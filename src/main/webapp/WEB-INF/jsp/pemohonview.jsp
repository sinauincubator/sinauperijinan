<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="pemohonadd.htm">Daftar Pemohon Baru</a></h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<th>Id Pemohon</th>
			<th>Badan Usaha</th>
			<th>Nama Usaha</th>
			<th>Jenis Pemohon</th>
			<th>Nama Pemohon</th>
			<th>Jenis Kelamin</th>
			<th>Alamat</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${pemohons}" var="pemohon">
			<c:url var="editUrl" value="pemohonedit.htm?id=${pemohon.idPemohon}" />
		<tr>
			<td><c:out value="${pemohon.idPemohon}" /></td>
			<td><c:out value="${pemohon.badanUsaha}" /></td>
			<td><c:out value="${pemohon.namaUsaha}" /></td>
			<td><c:out value="${pemohon.jenisPemohon}" /></td>
			<td><c:out value="${pemohon.namaPemohon}" /></td>
			<td><c:out value="${pemohon.jenisKelamin}" /></td>
			<td><c:out value="${pemohon.alamat}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
