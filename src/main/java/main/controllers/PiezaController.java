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

import main.dto.Pieza;
import main.services.PiezaService;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaService piezaService;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return piezaService.listarPiezas();
	}
	
	@GetMapping("/piezas/{codigo}")
	public Pieza buscarPieza(@PathVariable(name="codigo")Long codigo) {
		return piezaService.buscarPieza(codigo);
	}
	
	@PostMapping("/piezas")
	public Pieza guardarPieza(@RequestBody Pieza pieza) {
		return piezaService.guardarPieza(pieza);
	}
	
	@PutMapping("/piezas/{codigo}")
	public Pieza actualizarPieza(@PathVariable(name="codigo")Long codigo, @RequestBody Pieza pieza) {
		Pieza piezaSeleccionada = piezaService.buscarPieza(codigo);
		
		piezaSeleccionada.setNombre(pieza.getNombre());
		
		return piezaService.actualizarPieza(piezaSeleccionada);
	}
	
	@DeleteMapping("/piezas/{codigo}")
	public void eliminarPieza(@PathVariable(name="codigo") Long codigo) {
		piezaService.eliminarPieza(codigo);
	}
}
