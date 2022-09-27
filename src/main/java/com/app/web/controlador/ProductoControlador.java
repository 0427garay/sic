package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Producto;
import com.app.web.servicio.ProductoServicio;

public class ProductoControlador {
    
	@Autowired
	private ProductoServicio servicio;
	@GetMapping({"/productos","/"})
	public String listarProductos(Model  modelo) {
		modelo.addAttribute("productos", servicio.listarTodosLosProductos());
		return"productos";
	}
	
	@GetMapping("/productos/nuevo")
	public String crearProductoFormulario(Model modelo) {
		Producto producto= new Producto();
		modelo.addAttribute("producto",producto);
		return "crear_producto";
	}
	@PostMapping("/productos")
	public String guardarProducto(@ModelAttribute("producto")Producto producto) {
		servicio.guardarProducto(producto);
		return"redirect:/productos";
	}
	@GetMapping("/productos/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("producto", servicio.obtenerProductoPorId(id));
		return "editar_producto";
	}
	@PostMapping("/productos/{id}")
	public String actualizarProducto(@PathVariable Long id, @ModelAttribute("producto") Producto producto, Model modelo) {
	    Producto productoExistente = servicio.obtenerProductoPorId(id);
	    productoExistente.setId(id);
	    productoExistente.setNombre(producto.getNombre());
	    productoExistente.setValor(producto.getValor());
	    productoExistente.setEstado(producto.getEstado());
          productoExistente.setStock(producto.getStock());
	    
	    servicio.actualizarProducto(productoExistente);
		return "redirect:/productos";
		
	}
	@GetMapping("/productos/{id}")
	public String eliminarProducto(@PathVariable Long id){
		servicio.eliminarProducto(id);
		return "redirect:/productos";
		
	}
 
}
