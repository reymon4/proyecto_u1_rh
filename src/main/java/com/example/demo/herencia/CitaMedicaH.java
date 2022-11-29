package com.example.demo.herencia;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CitaMedicaH {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private MedicoH medico;
	private PacienteH paciente;
	
	public void agendar(String numero, LocalDateTime fechaCita,PacienteH ph,MedicoH mh) {
		this.numero= numero;
		this.fechaCita= fechaCita;
		this.fechaAgenda= LocalDateTime.now();
		
		Integer valorDescuento = ph.calcularDescuento();
		System.out.println("Valor: "+valorDescuento);
		
		this.medico = mh;
		
		this.guardarCita(this);
		
	}
	
	private void guardarCita(CitaMedicaH cita) {
		//Insert en la base de datos, guardar la cita
		System.out.println("Se ha generado la cita medica");
		System.out.println(cita);	
	}
	
	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paceinte=" + paciente + "]";
	}
	
	
	
	//SET Y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}
	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}
	public MedicoH getMedico() {
		return medico;
	}
	public void setMedico(MedicoH medico) {
		this.medico = medico;
	}
	public PacienteH getPaceinte() {
		return paciente;
	}
	public void setPaceinte(PacienteH paceinte) {
		this.paciente = paceinte;
	}
	
	

}