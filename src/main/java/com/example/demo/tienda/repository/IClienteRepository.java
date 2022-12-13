package com.example.demo.tienda.repository;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteRepository {
	 //Métodos básicos del CRUD
	
	public void insertar(Cliente cli);
	public void actualizar(Cliente cli);
	public void eliminar(String cedula);
	public Cliente buscar(String cedula);
	

}
