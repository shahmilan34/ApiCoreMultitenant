package com.factelcore.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class PerfilOperadorId extends BaseObject implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column(name="pk_fk_pop_cod_ope")
	private Integer uid;
	
	@Column(name="pk_fk_pop_cod_per")
	private Integer idPerfil;
	
	public PerfilOperadorId() {
		super();
	}

	public PerfilOperadorId(Integer uid, Integer idPerfil) {
		super();
		this.uid = uid;
		this.idPerfil = idPerfil;
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
	public Integer getIdPerfil() {
		return idPerfil;
	}

	/**
	 * M�todo modificador de la propiedad "idPerfil"
	 * @param idPerfil
	 */
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}	
}
