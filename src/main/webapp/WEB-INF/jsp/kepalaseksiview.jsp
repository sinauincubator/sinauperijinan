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
			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${surveys}" var="survey">
			<c:url var="editUrl" value="surveyedit.htm?noPermintaan=${survey.noPermintaan}" />
		<tr>
			<td><c:out value="${survey.noPermintaan}" /></td>
			<td><c:out value="${survey.pemohon}" /></td>
			<td><c:out value="${survey.nama}" /></td>
			<td><c:out value="${survey.jenisKelamin}" /></td>
			<td><c:out value="${survey.noKTP}" /></td>
			<td><c:out value="${survey.tglTerima}" /></td>
			<td><c:out value="${survey.telepon}" /></td>
			<td><c:out value="${survey.jmlIzinBelumSurvey}" /></td>

			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
