package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

//Esta clase es la implmentación de la interfaz de la funcionalidad común

//Es identificador del service
@Service("Pesado")
public class MatriculaPesadoServiceImpl implements IMatriculaNuevaService {

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado vehículo pesado");
	}

}
