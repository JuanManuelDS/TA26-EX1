package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Proveedor;
import main.services.ProveedorService;

@RestController
@RequestMapping("/api")
public class ProveedorController {

	@Autowired
	ProveedorService proveedorService;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores(){
		return proveedorService.listarProveedores();
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedor buscarProveedor(@PathVariable(name="id")String id) {
		return proveedorService.buscarProveedor(id);
	}
	
	@PostMapping("/proveedores")
	public Proveedor guardarProveedor(@RequestBody Proveedor proveedor) {
		return proveedorService.guardarProveedor(proveedor);
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id")String id, @RequestBody Proveedor proveedor) {
		Proveedor proveedorSeleccionado = proveedorService.buscarProveedor(id);
		
		proveedorSeleccionado.setNombre(proveedor.getNombre());
		
		return proveedorService.actualizarProveedor(proveedorSeleccionado);
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name="id")String id) {
		proveedorService.eliminarProveedor(id);
	}
}
