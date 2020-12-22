package com.ctorres.persistencia.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_compra")
	private Integer idcompra;
	
	private LocalDateTime fecha;
	private String comentario;
	private String estado;
	
	@ManyToOne
	//para que no permita crear nuevos clientes a traves de esta relacion
	//aqui solo nos interesa recuperar toda la informacion del cliente que esta realizando la compra.
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;
	
	@OneToMany(mappedBy = "producto", cascade = {CascadeType.ALL})
	private List<Comprasproducto> productos;
	
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the productos
	 */
	public List<Comprasproducto> getProductos() {
		return productos;
	}
	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Comprasproducto> productos) {
		this.productos = productos;
	}
	/**
	 * @return the idcompra
	 */
	public Integer getIdcompra() {
		return idcompra;
	}
	/**
	 * @param idcompra the idcompra to set
	 */
	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}
	/**
	 * @return the fecha
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}
	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the mediopago
	 */
	public String getMediopago() {
		return mediopago;
	}
	/**
	 * @param mediopago the mediopago to set
	 */
	public void setMediopago(String mediopago) {
		this.mediopago = mediopago;
	}
	/**
	 * @return the idcliente
	 */
	public String getIdcliente() {
		return idcliente;
	}
	/**
	 * @param idcliente the idcliente to set
	 */
	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}
	@Column(name = "medio_pago")
	private String mediopago;
	@Column(name="id_cliente")
	private String idcliente;
}
