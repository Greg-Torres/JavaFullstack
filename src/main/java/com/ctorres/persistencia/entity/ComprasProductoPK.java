package com.ctorres.persistencia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ComprasProductoPK implements Serializable{
	
	@Column(name="id_compra")
	private String idcompra;
	@Column(name="id_producto")
	private String idproducto;
	/**
	 * @return the idcompra
	 */
	public String getIdcompra() {
		return idcompra;
	}
	/**
	 * @param idcompra the idcompra to set
	 */
	public void setIdcompra(String idcompra) {
		this.idcompra = idcompra;
	}
	/**
	 * @return the idproducto
	 */
	public String getIdproducto() {
		return idproducto;
	}
	/**
	 * @param idproducto the idproducto to set
	 */
	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}

}
