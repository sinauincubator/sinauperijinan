<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="masterkbliadd.htm">Daftar Izin Baru</a></h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<th>KBLI</th>
			<th>Deskripsi</th>>
			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${masterkblis}" var="masterkbli">
			<c:url var="editUrl" value="masterkbli.htm?id=${masterkbli.kbli}" />
		<tr>
			<td><c:out value="${masterkbli.kbli}" /></td>
			<td><c:out value="${masterkbli.deskripsi}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
