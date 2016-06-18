ini adalah aplikasi untuk pembuatan perijinan

ubah konfigurasi mysql dan sesuaikan dengan konfigurasi yang ada pada local pc
pastikan port 8080 tidak ada yang menggunakan
untuk menjalankan gunakan command prompt dan gunakan perintah "mvn tomcat:run:

untuk debuggin jalankan perintah berikut:
$ export MAVEN_OPTS=-agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n
$ mvn tomcat7:run-war


