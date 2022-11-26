package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class PacienteSB {
	private String nombre;
	private String cedula;
	private String tipo;
	
	 	protected Integer calcularDescuento() {
			System.out.println("Sin descuento");
			return 0;		
		}
	 	
	 	

		@Override
		public String toString() {
			return "PacienteH [nombre=" + nombre + ", cedula=" + cedula + ", tipo=" + tipo + ", calcularDescuento()="
					+ calcularDescuento() + ", getNombre()=" + getNombre() + ", getCedula()=" + getCedula()
					+ ", getTipo()=" + getTipo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}



		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	 	
	

}
