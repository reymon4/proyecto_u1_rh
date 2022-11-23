package com.example.demo.springboot;
import org.springframework.stereotype.Component;

@Component

public class PacienteCancerSB extends PacienteSB {
	protected Integer calcularDescuento() {
		System.out.println("Paciente Cancer con el 30% descuento");
		return 30;		
	}

}
