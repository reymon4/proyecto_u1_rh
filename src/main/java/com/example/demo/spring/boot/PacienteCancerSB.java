package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteCancerSB extends PacienteSB {
	public Integer calcularDescuento() {
		System.out.println("Paciente con Cancer con el 30% de descuento");
		return 30; 
	}
	//Clase nueva
}
