package com.example.demo.tienda.service;

import java.util.List;

import com.example.demo.tienda.modelo.Factura;
import com.example.demo.tienda.modelo.ItemTO;

public interface IFacturaService {
	public void generar(String cedula, List<ItemTO> detalles);//insertar
	
}
