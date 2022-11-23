package com.example.demo.springboot;

import java.time.LocalDate;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.demo.tradicional.CitaMedica;
import com.example.demo.tradicional.Medico;
import com.example.demo.tradicional.Paciente;

@Service
public class CitaMedicaSB {
		private String numero;
		private LocalDateTime fechaCita;
		private LocalDateTime fechaAgenda;
		private MedicoSB medico;
		private PacienteSB paciente;
		
		
		public void agendar(PacienteSB ph,String numero, LocalDateTime fechaCita, MedicoSB mh) {
			this.numero= numero;
			this.fechaCita= fechaCita;
			this.fechaAgenda = LocalDateTime.now();
			
		
			Integer valorDescuento = ph.calcularDescuento();
			System.out.println("Valor:"+ valorDescuento);
			
			this.medico =mh;
			this.guardarCita(this);
			
			
		}
		private void guardarCita(CitaMedicaSB citaMedicaH) {
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
		public MedicoSB getMedico() {
			return medico;
		}
		public void setMedico(MedicoSB medico) {
			this.medico = medico;
		}
		public PacienteSB getPaciente() {
			return paciente;
		}
		public void setPaciente(PacienteSB paciente) {
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
