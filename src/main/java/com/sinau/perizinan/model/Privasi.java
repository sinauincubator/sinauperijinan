package com.sinau.perizinan.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRIVASI")
public class Privasi implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_PRIVASI")
	private int idPrivasi;

	@Column(name="ROLE_NAME")
	private String roleName;

	public int getIdPrivasi() {
		return idPrivasi;
	}

	public void setIdPrivasi(int idPrivasi) {
		this.idPrivasi = idPrivasi;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


}
