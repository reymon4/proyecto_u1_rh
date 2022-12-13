package com.example.demo.tienda.modelo;

import java.math.BigDecimal;

public class Detalle {
	private Producto producto;
	private String numero;
	private Integer cantidad;
	private BigDecimal subtotal;
	
	
	@Override
	public String toString() {
		return "Detalle [producto=" + producto + ", numero=" + numero + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + "]";
	}
	//Getters and Setters
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
	
}
