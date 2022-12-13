package com.example.demo.tienda.service;

import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Producto;
import com.example.demo.tienda.repository.IDetalleRepository;
import com.example.demo.tienda.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{
	private IProductoRepository productoRepository;
	@Override
	public void insertar(Producto pro) {
		// TODO Auto-generated method stub
		this.productoRepository.insertar(pro);
	}

}
