package com.ctorres.persistencia.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="compras_productos")
public class Comprasproducto {
	
	 @EmbeddedId
	private ComprasProductoPK id;
	private Integer cantidad;
	private Boolean estado;
	private Double total;
	
	@ManyToOne
	@MapsId("idcompra")
	@JoinColumn(name = "id_compra" ,insertable = false,updatable = false)
	private Compra compra;
	
	@ManyToOne
	@JoinColumn(name = "id_producto",insertable = false,updatable = false)
	private Producto producto;

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the estado
	 */
	public Boolean getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * @return the id
	 */
	public ComprasProductoPK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ComprasProductoPK id) {
		this.id = id;
	}

	/**
	 * @return the compra
	 */
	public Compra getCompra() {
		return compra;
	}

	/**
	 * @param compra the compra to set
	 */
	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
