package com.example.demo.herencia;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.demo.tradicional.CitaMedica;
import com.example.demo.tradicional.Medico;
import com.example.demo.tradicional.Paciente;

public class CitaMedicaH {
		private String numero;
		private LocalDateTime fechaCita;
		private LocalDateTime fechaAgenda;
		private MedicoH medico;
		private PacienteH paciente;
		
		
		public void agendar(PacienteH ph,String numero, LocalDateTime fechaCita, MedicoH mh) {
			this.numero= numero;
			this.fechaCita= fechaCita;
			this.fechaAgenda = LocalDateTime.now();
			
		
			Integer valorDescuento = ph.calcularDescuento();
			System.out.println("Valor:"+ valorDescuento);
			
			this.medico =mh;
			this.guardarCita(this);
			
			
		}
		private void guardarCita(CitaMedicaH citaMedicaH) {
			//Aquí vamos a insertar en la BD
			System.out.println(citaMedicaH);
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
		public PacienteH getPaciente() {
			return paciente;
		}
		public void setPaciente(PacienteH paciente) {
			this.paciente = paciente;
		}
		@Override
		public String toString() {
			return "CitaMedicaH [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
					+ ", medico=" + medico + ", paciente=" + paciente + ", getNumero()=" + getNumero()
					+ ", getFechaCita()=" + getFechaCita() + ", getFechaAgenda()=" + getFechaAgenda() + ", getMedico()="
					+ getMedico() + ", getPaciente()=" + getPaciente() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		


		
		
		
		
	
}
