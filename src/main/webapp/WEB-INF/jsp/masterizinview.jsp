<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="masterizinadd.htm">Daftar Izin Baru</a></h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<th>Kode Izin</th>
			<th>Jenis</th>
			<th>Izin</th>
			<th>Dasar</th>
			<th>Peraturan</th>
			<th>KPI</th>
			<th>Aktif</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${masterizins}" var="masterizin">
			<c:url var="editUrl" value="masterizinedit.htm?kodeIzin=${masterizin.kodeIzin}" />
		<tr>
			<td><c:out value="${masterizin.kodeIzin}" /></td>
			<td><c:out value="${masterizin.jenis}" /></td>
			<td><c:out value="${masterizin.izin}" /></td>
			<td><c:out value="${masterizin.dasar}" /></td>
			<td><c:out value="${masterizin.peraturan}" /></td>
			<td><c:out value="${masterizin.kpi}" /></td>
			<td><c:out value="${masterizin.aktif}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>

</table>

<h1><a href="masterizinadd.htm">Tambah Syarat-Syarat</a></h1>

<table style="border: 1px solid; width: 98%">
<thead style="background:#EBDEF0">
	<tr>
		<th>Kode Izin</th>
		<th>Kode Syarat</th>
		<th>Syarat</th>
		<th>Aktif</th>
		<th></th>
	</tr>
</thead>
<tbody>
<c:forEach items="${masterizins}" var="masterizin">
		<c:url var="editUrl" value="masterizinedit.htm?kodeIzin=${masterizin.kodeIzin}" />
	<tr>
		<td><c:out value="${masterizin.kodeIzinSyarat}" /></td>
		<td><c:out value="${masterizin.kodeSyarat}" /></td>
		<td><c:out value="${masterizin.syarat}" /></td>
		<td><c:out value="${masterizin.aktifSyarat}" /></td>
		<td><a href="${editUrl}">Edit</a></td>
	</tr>
</c:forEach>
</tbody>

</table>
</body>
</html>
