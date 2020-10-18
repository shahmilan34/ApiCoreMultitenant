package com.factelcore.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class UsuarioSolicitudInfoId extends BaseObject implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column(name="pk_fk_usi_usu")
	private Integer uid;
	
	@Column(name="pk_fk_usi_cod_sol_inf")
	private Integer idSolInf;
	
	public UsuarioSolicitudInfoId() {
		super();
	}

	public UsuarioSolicitudInfoId(Integer uid, Integer idSolInf) {
		super();
		this.uid = uid;
		this.idSolInf = idSolInf;
	}

	/**
	 * M�todo de acceso a la propiedad "uid"
	 * @return uid
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * M�todo modificador de la propiedad "uid"
	 * @param uid
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	/**
	 * M�todo de acceso a la propiedad "idPerfil"
	 * @return idPerfil
	 */
	public Integer getidSolInf() {
		return idSolInf;
	}

	/**
	 * M�todo modificador de la propiedad "idPerfil"
	 * @param idPerfil
	 */
	public void setidSolInf(Integer idSolInf) {
		this.idSolInf = idSolInf;
	}
}
