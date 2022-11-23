package com.example.demo.herencia;

public class PacienteTerceraEdadH extends PacienteH {
	private String codeIESS;

	public String getCodeIESS() {
		return codeIESS;
	}

	public void setCodeIESS(String codeIESS) {
		this.codeIESS = codeIESS;
	}
	
	protected Integer calcularDescuento() {
		System.out.println("Paciente TerceraEdad con el 20% descuento");
		return 20;		
	}
	
}
