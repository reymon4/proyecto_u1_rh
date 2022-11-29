package com.example.demo.spring.boot;

public class PacienteSB {
	private String nombre;
	private String cedula;
	private String tipo;
	
	protected Integer calcularDescuento() {
		System.out.println("Sin descuento");
		return 0;
	}
	
	//Set y get
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", cedula=" + cedula + "]";
	}

	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public  String getCedula() {
		return cedula;
	}
	public  void setCedula(String cedula) {
		this.cedula = cedula;
	}
	

}