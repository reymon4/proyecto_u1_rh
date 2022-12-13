package com.example.demo.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Factura;
import com.example.demo.tienda.modelo.ItemTO;
import com.example.demo.tienda.repository.IClienteRepository;
import com.example.demo.tienda.repository.IDetalleRepository;
import com.example.demo.tienda.repository.IFacturaRepository;

@Service
public class FacturaServiceImpl implements IFacturaService {
	@Autowired
	private IFacturaRepository facturaRepository;
	@Autowired
	private IClienteRepository clienteRepository;
	@Override
	public void generar(String cedula, List<ItemTO> detalles) {
		// TODO Auto-generated method stub
		Cliente cli = this.clienteRepository.buscar(cedula);
		Factura fac = new Factura();
		fac.setCliente(cli);
		this.facturaRepository.insertar(fac);
	}

}
