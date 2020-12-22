package com.ctorres.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Integer idproducto;
	
	private String nombre;
	
	@Column(name="id_categoria")
	private Integer idcategoria;
	
	@Column(name="codigo_barras")
	private String codigobarras;
	
	@Column(name="precio_venta")
	private Double precioventa;
	
	@Column(name = "cantidad_stock")
	private Integer cantidadstock;

	private Boolean estado;
	
	 @ManyToOne
	 
	 @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
	 //nos sirve para recuperar a que categoria pertenece un producto.
	 private Categoria categoria;

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the idproducto
	 */
	public Integer getIdproducto() {
		return idproducto;
	}

	/**
	 * @param idproducto the idproducto to set
	 */
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the idcategoria
	 */
	public Integer getIdcategoria() {
		return idcategoria;
	}

	/**
	 * @param idcategoria the idcategoria to set
	 */
	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	/**
	 * @return the codigobarras
	 */
	public String getCodigobarras() {
		return codigobarras;
	}

	/**
	 * @param codigobarras the codigobarras to set
	 */
	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}

	/**
	 * @return the precioventa
	 */
	public Double getPrecioventa() {
		return precioventa;
	}

	/**
	 * @param precioventa the precioventa to set
	 */
	public void setPrecioventa(Double precioventa) {
		this.precioventa = precioventa;
	}

	/**
	 * @return the cantidadstock
	 */
	public Integer getCantidadstock() {
		return cantidadstock;
	}

	/**
	 * @param cantidadstock the cantidadstock to set
	 */
	public void setCantidadstock(Integer cantidadstock) {
		this.cantidadstock = cantidadstock;
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
}
