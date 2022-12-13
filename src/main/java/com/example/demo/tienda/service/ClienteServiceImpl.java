package com.example.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.ICuentaBancariaRepository;
import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private IClienteRepository clienteRepository;

	@Override
	public void insertar(Cliente cli) {
		// TODO Auto-generated method stub
		this.clienteRepository.insertar(cli);
	}

	@Override
	public void actualizar(Cliente cli) {
		// TODO Auto-generated method stub
		this.clienteRepository.actualizar(cli);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.clienteRepository.eliminar(cedula);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepository.buscar(cedula);
	}

}
