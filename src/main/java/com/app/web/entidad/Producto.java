package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombreProducto", nullable = false, length = 50)
	private String nombre;
	@Column(name = "valorProducto", nullable = false, length = 50)
	private String valor;
	@Column(name = "estadoProducto", nullable = false, length = 50, unique = true)
	private String estado;
	@Column(name = "stock", nullable = false, length = 50, unique = true)
	private String stock;
     
	
	public Producto() {
		
	}


	public Producto(Long id, String nombre, String valor, String estado, String stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
		this.estado = estado;
		this.stock = stock;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getStock() {
		return stock;
	}


	public void setStock(String stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", valor=" + valor + ", estado=" + estado + ", stock="
				+ stock + "]";
	}
	
}
