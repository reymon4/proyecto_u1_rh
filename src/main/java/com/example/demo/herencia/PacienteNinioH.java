package com.example.demo.herencia;

public class PacienteNinioH extends PacienteH{
private int pesoNacimiento;

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}
	
	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}

	protected Integer calcularDescuento() {
		System.out.println("Paciente Ninio con el 10% de descuento");
		return 10;
	}
}
