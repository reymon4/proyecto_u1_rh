package com.example.demo.tienda.service;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteService {
	public void insertar(Cliente cli);
	public void actualizar(Cliente cli);
	public void eliminar(String cedula);
	public Cliente buscar(String cedula);

}
