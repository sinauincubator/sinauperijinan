<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <title>Insert title here</title>
    </head>
<body>

<h1>Tambahkan Pemohon Baru</h1>

<c:url var="saveUrl" value="masterkbliadd.htm" />
<form:form modelAttribute="masterKbliAttribute" method="POST" action="${saveUrl}">
	<table style="width: 100%">
		<tr>
            <td> KBLI </td>
            <td> : </td>
            <td><input type="text" size="50" maxlength="100" name="txtKbli"></td>
        </tr>
        <tr>
            <td> Deskripsi </td>
            <td> : </td>
            <td><input type="text" size="50" maxlength="100" name="txtDeskripsi"></td>
        </tr>	</tr>
	</table>

	<input id="submit" type="submit" value="Save" />
	<script type="text/javascript">
	    Spring.addDecoration(new Spring.ValidateAllDecoration({
		    elementId: "submit",
		    event: "onclick" }));
	</script>
	</form:form>
</body>
</html>
