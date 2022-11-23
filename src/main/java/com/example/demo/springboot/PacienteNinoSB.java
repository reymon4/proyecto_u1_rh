package com.example.demo.springboot;
import org.springframework.stereotype.Component;

@Component

public class PacienteNinoSB extends PacienteSB{
	private int pesoNacimiento;

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}
	
	protected Integer calcularDescuento() {
		System.out.println("Paciente Niño con el 10% descuento");
		return 10;		
	}
}
