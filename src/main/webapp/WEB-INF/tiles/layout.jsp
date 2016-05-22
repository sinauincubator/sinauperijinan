<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
    <head>
		<title><tiles:insertAttribute name="title" ignore="true" /></title>

        <link rel="stylesheet" type="text/css" media="all" href="/sinauperijinan/styles/simplicity/theme.css" />

        <script type="text/javascript" src="/sinauperijinan/scripts/prototype.js"></script>
        <script type="text/javascript" src="/sinauperijinan/scripts/scriptaculous.js"></script>
        <script type="text/javascript" src="/sinauperijinan/scripts/global.js"></script>

        <script type="text/javascript" src="<c:url value="/resources/dojo/dojo.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/resources/spring/Spring.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/resources/spring/Spring-Dojo.js"/>"></script>
		<link type="text/css" rel="stylesheet" href="<c:url value="/resources/dijit/themes/tundra/tundra.css"/>" />
    </head>
<body class="tundra">
<div id="page">
    <div id="header" class="clearfix">
		<div id="branding">
	    		<h1><a href="welcome.htm">Aplikasi Perizinan Pemda</a></h1>
	    		<p>Melayani perizinan anda dengan mudah, cepat dan transparan.</p>
		</div>
		<hr/>
    </div>

     <div id="content" class="clearfix">
     	<div id="main">
        	<tiles:insertAttribute name="body" />
        </div>

        <div id="nav">
         	<div class="wrapper">
            	<ul id="primary-nav" class="menuList">
	    			<li class="pad">&nbsp;</li>
	                <li>
	    	        	<a href="welcome.htm" title="Home" class="current" >Home</a>
	    		    </li>
	                <li class="menubar">
	                	<a href="" title="Master" class="current" >Master</a>
	                    <ul>
	        		    	<li>
	                        	<a href="pemohonview.htm" title="Master Pemohon">Master Pemohon</a>
	            			</li>
	            			<li>
	                        	<a href="masterizinview.htm" title="Master Izin">Master Izin</a>
	            			</li>
	            			<li>
	                        	<a href="masterprofiledit.htm" title="Master Profil">Master Profil</a>
	            			</li>
	            			<li class="last">
	                        	<a href="masterkbliview.htm" title="Master KBLI">Master KBLI</a>
	            			</li>
	            		</ul>
	                </li>
	                <li class="menubar">
	                	<a href="" title="Perizinan" class="current" >Perizinan</a>
	                    <ul>
	                    	<li class="menubar">
			                	<a href="" title="Permohonan Izin">Permohonan Izin</a>
			                    <ul>
			        		    	<li>
		                        		<a href="#" title="Tambah Baru">Tambah Baru</a>
			            			</li>
			            			<li>
			                        	<a href="#" title="Perpanjang Izin">Perpanjang Izin</a>
			            			</li>
			            			<li>
			                        	<a href="#" title="Perubahan Izin">Perubahan Izin</a>
			            			</li>
			            			<li class="last">
			                        	<a href="#" title="Lihat Data Izin">Lihat Data Izin</a>
			            			</li>
			            		</ul>
	                		</li>
	            			<li class="menubar last">
			                	<a href="" title="Proses Izin" >Proses Izin</a>
			                    <ul>
			        		    	<li>
		                        		<a href="#" title="Administrasi">Administrasi</a>
			            			</li>
			            			<li>
			                        	<a href="#" title="Survey">Survey</a>
			            			</li>
			            			<li>
			                        	<a href="#" title="Kepala Seksi">Kepala Seksi</a>
			            			</li>
			            			<li>
			                        	<a href="#" title="Kepala Bagian">Kepala Bagian</a>
			            			</li>
			            			<li>
			                        	<a href="kepalabidangview.htm" title="Kepala Bidang">Kepala Bidang</a>
			            			</li>
			            			<li>
			                        	<a href="sekretariatview.htm" title="Sekretariat">Sekretariat</a>
			            			</li>
			            			<li class="last">
			                        	<a href="kepalabadanview.htm" title="Kepala Badan">Kepala Badan</a>
			            			</li>
			            		</ul>
	                		</li>
	            		</ul>
	                </li>
	                <li class="menubar">
			            <a href="" title="Pencetakan" class="current" >Pencetakan</a>
			            <ul>
			        		<li class="last">
			                	<a href="#" title="Pencetakan Izin">Pencetakan Izin</a>
			            	</li>
			        	</ul>
			        </li>
			        <li class="menubar">
			            <a href="" title="Laporan" class="current" >Laporan</a>
			            <ul>
			        		<li>
			                	<a href="#" title="Monitoring">Monitoring</a>
			            	</li>
			            	<li class="last">
			                	<a href="#" title="Summary">Summary</a>
			            	</li>
			        	</ul>
			        </li>
			        <li class="menubar">
			            <a href="" title="Privasi Pengguna" class="current" >Privasi Pengguna</a>
			            <ul>
			            	<li>
			                	<a href="privasiview.htm" title="Privasi">Privasi</a>
			            	</li>
			            	<li>
			                	<a href="penggunaview.htm" title="Pengguna">Pengguna</a>
			            	</li>
			            	<li class="last">
			                	<a href="#" title="Profil Saya">Profil Saya</a>
			            	</li>
			        	</ul>
			        </li>
	                <li>
	                	<a href="#" title="Logout" class="current" >Logout</a>
	            	</li>
            	</ul>
			</div>
            <hr/>
		</div><!-- end nav -->
	</div>

    <div id="footer" class="clearfix">

    <div id="divider"><div></div></div>
    <span class="right">Copyright <b>SinauCyberspace&#8482;</b> Workaround &copy; 2016
    </span>
        </div>
    </div>
</body>
</html>
</html>