package com.sinau.perizinan.common;

import org.springframework.ui.Model;

public class ScopeVariableAssigner {

	private final String VIEW_LINK = "viewLink";
	private final String ADD_LINK = "addLink";
	private final String EDIT_LINK = "editLink";
	private final String LOGOUT_LINK = "logoutLink";

	private final String USER_MESSAGE_STATUS = "status";
	private final String USER_MESSAGE_MESSAGE = "message";

	protected final String USER_MESSAGE_STATUS_SUCCESS = "Success";
	protected final String USER_MESSAGE_STATUS_FAILED = "Failed";

	// Buat khusus masing-masing controller satu buah method yang seperti ini
	protected void assignMasterKbliScopeVariable(Model model) {
		model.addAttribute(VIEW_LINK, PerizinanPathMappingConstants.MASTER_KBLI_VIEW_REQUEST_MAPPING);
		model.addAttribute(ADD_LINK, PerizinanPathMappingConstants.MASTER_KBLI_ADD_REQUEST_MAPPING);
		model.addAttribute(EDIT_LINK, PerizinanPathMappingConstants.MASTER_KBLI_EDIT_REQUEST_MAPPING);
		model.addAttribute(LOGOUT_LINK, PerizinanPathMappingConstants.LOGOUT_REQUEST_MAPPING);
	}

	protected void assignPrivasiScopeVariable(Model model) {
		model.addAttribute(VIEW_LINK, PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_VIEW_REQUEST_MAPPING);
		model.addAttribute(ADD_LINK, PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_REQUEST_MAPPING);
		model.addAttribute(EDIT_LINK, PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_REQUEST_MAPPING);
		model.addAttribute(LOGOUT_LINK, PerizinanPathMappingConstants.LOGOUT_REQUEST_MAPPING);
	}

	protected void assignMasterPemohonScopeVariable(Model model) {
		model.addAttribute(VIEW_LINK, PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_REQUEST_MAPPING);
		model.addAttribute(ADD_LINK, PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING);
		model.addAttribute(EDIT_LINK, PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_REQUEST_MAPPING);
		model.addAttribute(LOGOUT_LINK, PerizinanPathMappingConstants.LOGOUT_REQUEST_MAPPING);
	}

	protected void assignMasterIzinScopeVariable(Model model) {
		model.addAttribute(VIEW_LINK, PerizinanPathMappingConstants.MASTER_IZIN_VIEW_REQUEST_MAPPING);
		model.addAttribute(ADD_LINK, PerizinanPathMappingConstants.MASTER_IZIN_ADD_REQUEST_MAPPING);
		model.addAttribute(EDIT_LINK, PerizinanPathMappingConstants.MASTER_IZIN_EDIT_REQUEST_MAPPING);
		model.addAttribute(LOGOUT_LINK, PerizinanPathMappingConstants.LOGOUT_REQUEST_MAPPING);
	}
	protected void assignMonitoringScopeVariable(Model model) {
		model.addAttribute(VIEW_LINK, PerizinanPathMappingConstants.LAPORAN_MONITORING_VIEW_REQUEST_MAPPING);
		model.addAttribute(ADD_LINK, PerizinanPathMappingConstants.LAPORAN_MONITORING_ADD_REQUEST_MAPPING);
		model.addAttribute(EDIT_LINK, PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_REQUEST_MAPPING);
		model.addAttribute(LOGOUT_LINK, PerizinanPathMappingConstants.LOGOUT_REQUEST_MAPPING);
	}
	protected void assignPermohonanIzinScopeVariable(Model model) {
		model.addAttribute(VIEW_LINK, PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_VIEW_REQUEST_MAPPING);
		model.addAttribute(ADD_LINK, PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_ADD_REQUEST_MAPPING);
		model.addAttribute(EDIT_LINK, PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_REQUEST_MAPPING);
		model.addAttribute(LOGOUT_LINK, PerizinanPathMappingConstants.LOGOUT_REQUEST_MAPPING);
	}

	// Gunakan method ini secara global, tidak perlu membuat lagi
	protected void assignUserMessage(Model model, String status, String message) {
		model.addAttribute(USER_MESSAGE_STATUS, status != null ? status : "");
		model.addAttribute(USER_MESSAGE_MESSAGE, message != null ? message : "");
	}


}
