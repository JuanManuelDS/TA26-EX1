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

import main.dto.Suministra;
import main.services.SuministraService;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraService suministraService;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministra(){
		return suministraService.listarSuministra();
	}
	
	@GetMapping("/suministra/{id}")
	public Suministra buscarSuministra(@PathVariable(name="id") Long id) {
		return suministraService.buscarSuministra(id);
	}
	
	@PostMapping("/suministra")
	public Suministra guardarSuministra(@RequestBody Suministra suministra) {
		return suministraService.guardarSuministra(suministra);
	}
	
	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name="id")Long id, @RequestBody Suministra suministra) {
		
		Suministra suministraSeleccionado = suministraService.buscarSuministra(id);
		
		suministraSeleccionado.setPieza(suministra.getPieza());
		suministraSeleccionado.setPrecio(suministra.getPrecio());
		suministraSeleccionado.setProveedor(suministra.getProveedor());
		
		return suministraService.actualizarSuministra(suministraSeleccionado);
	}
	
	@DeleteMapping("/suministra/{id}")
	public void eliminarSuministra(@PathVariable(name="id")Long id) {
		suministraService.eliminarSuministra(id);
	}
}
