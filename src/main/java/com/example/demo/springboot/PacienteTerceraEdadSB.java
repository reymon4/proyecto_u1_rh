package com.example.demo.springboot;
import org.springframework.stereotype.Component;

@Component
public class PacienteTerceraEdadSB extends PacienteSB {
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
