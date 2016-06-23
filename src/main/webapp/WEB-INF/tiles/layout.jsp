<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
    <head>
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
    	
		<title><tiles:insertAttribute name="title" ignore="true" /></title>

        <link rel="stylesheet" type="text/css" media="all" href="/sinauperijinan/styles/simplicity/theme.css" />

        <script type="text/javascript" src="/sinauperijinan/scripts/prototype.js"></script>
        <script type="text/javascript" src="/sinauperijinan/scripts/scriptaculous.js"></script>
        <script type="text/javascript" src="/sinauperijinan/scripts/global.js"></script>

        <script type="text/javascript" src="<c:url value="/resources/dojo/dojo.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/resources/spring/Spring.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/resources/spring/Spring-Dojo.js"/>"></script>
		
		<script src="/sinauperijinan/scripts/jquery-3.0.0.min.js"></script>
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
		                        		<a href="permohonanizinadd.htm" title="Tambah Izin">Tambah Baru</a>
			            			</li>
			            			<li>
			                        	<a href="permohonanizinedit.htm" title="Edit Izin">Perpanjang Izin</a>
			            			</li>
			            			<li>
			                        	<a href="permohonanizinedit.htm" title="Edit Izin">Perubahan Izin</a>
			            			</li>
			            			<li class="last">
			                        	<a href="permohonanizinview.htm" title="Lihat Data Izin">Lihat Data Izin</a>
			            			</li>
			            		</ul>
	                		</li>
	            			<li class="menubar last">
			                	<a href="" title="Proses Izin" >Proses Izin</a>
			                    <ul>
			        		    	<li>
		                        		<a href="administrasiview.htm" title="Administrasi">Administrasi</a>
			            			</li>
			            			<li>
			                        	<a href="surveyview.htm" title="Survey">Survey</a>
			            			</li>
			            			<li>
			                        	<a href="kepalaseksiview.htm" title="Kepala Seksi">Kepala Seksi</a>
			            			</li>
			            			<li>
			                        	<a href="kepalabagianview.htm" title="Kepala Bagian">Kepala Bagian</a>
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
			                	<a href="monitoringview.htm" title="Monitoring">Monitoring</a>
			            	</li>
			            	<li class="last">
			                	<a href="#" title="Summary">Summary</a>
			            	</li>
			        	</ul>
			        </li>
			        <li class="menubar">
			            <a href="" title="Keamanan" class="current" >Keamanan</a>
			            <ul>
			            	<li>
			                	<a href="privasiview.htm" title="Privasi">Hak Akses</a>
			            	</li>
			            	<li>
			                	<a href="penggunaview.htm" title="Pengguna">Pengguna</a>
			            	</li>
			            	<li class="last">
			                	<a href="#" title="Profil Saya">Profil Saya</a>
			            	</li>
			        	</ul>
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