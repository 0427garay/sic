package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.web.entidad.Producto;
import com.app.web.repositorio.ProductoRepositorio;

public class ProductoServicioImpl implements ProductoServicio{
	@Autowired
	private ProductoRepositorio repositorio;

	@Override
	public List<Producto> listarTodosLosProductos() {
		
		return repositorio.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override
	public Producto obtenerProductoPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override
	public void eliminarProducto(Long id) {
		repositorio.deleteById(id);
		
	}

	

}
