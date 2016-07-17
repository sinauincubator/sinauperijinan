package com.sinau.perizinan.dao;

import java.util.List;
import com.sinau.perizinan.model.PermohonanIzin;

public interface PermohonanIzinDAO extends GenericRepositoryDAO<PermohonanIzin> {

	public List<PermohonanIzin> getAllPermohonanIzin(int currentIndex) throws Exception;
	public PermohonanIzin getById(Integer idPemohon) throws Exception;
	public int getRowCount() throws Exception;

}
