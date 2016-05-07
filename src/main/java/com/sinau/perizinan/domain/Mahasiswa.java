package com.sinau.perizinan.domain;

public class Mahasiswa {

    private String id;

    private String nim;
    private String nama;
    private String telp;
   	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
	
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTelp(String telp) {
        this.telp = telp;
    }
	
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getTelp() {
        return telp;
    }
}
