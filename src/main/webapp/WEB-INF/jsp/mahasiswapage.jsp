<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="mahasiswaadd.htm">Mahasiswa</a></h1>

<table style="border: 1px solid; width: 98%; text-align:center">
	<thead style="background:#fcf">
		<tr>
			<th>Nim</th>
			<th>Nama</th>
			<th>Telp</th>
			<th colspan="3"></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${mahasiswas}" var="mahasiswa">
			<c:url var="editUrl" value="mahasiswaedit.htm?id=${mahasiswa.id}" />
			<c:url var="deleteUrl" value="mahasiswadelete.htm?id=${mahasiswa.id}" />
		<tr>
			<td><c:out value="${mahasiswa.nim}" /></td>
			<td><c:out value="${mahasiswa.nama}" /></td>
			<td><c:out value="${mahasiswa.telp}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
			<td><a href="${deleteUrl}">Delete</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>