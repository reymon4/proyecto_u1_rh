package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;
//Esta clase es la implmentación de la interfaz de la funcionalidad común
//Es identificador del service
@Service("Liviano")
public class MatriculaLivianoServiceImpl implements IMatriculaNuevaService {

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado vehículo liviano");
		System.out.println("Cálculo del descuento del 2000");
		
		
	}

}
