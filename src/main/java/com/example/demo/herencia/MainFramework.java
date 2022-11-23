package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {
	public static void main(String[] args) {
		
		/*PacienteTerceraEdadH pacienteTe = new PacienteTerceraEdadH();
		pacienteTe.setCedula("1225532");
		pacienteTe.setCodeIESS("1225532");
		
		
		pacienteTe.setNombre("Pepe");
		pacienteTe.setTipo("TE");*/
		/*PacienteNinoH pacienteTe = new PacienteNinoH();
		pacienteTe.setCedula("1225532");
		pacienteTe.setPesoNacimiento(8);
		
		pacienteTe.setNombre("Pepe");
		pacienteTe.setTipo("NI");*/
		PacienteCancerH pacienteTe = new PacienteCancerH();
		
		pacienteTe.setCedula("1225532");
		pacienteTe.setTipo("C");
		pacienteTe.setNombre("Pepe");
		
		MedicoH medico= new MedicoH();
		medico.setCedula("0600584785");
		medico.setNombre("Julio");
		CitaMedicaH cita = new CitaMedicaH();
		cita.agendar(pacienteTe,"1225532", LocalDateTime.of(2022, 11,1,8,30), medico);
		
	}

}
