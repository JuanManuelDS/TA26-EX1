package main.services;

import java.util.List;

import main.dto.Pieza;

public interface IPiezaService {

	public List<Pieza> listarPiezas();
	
	public Pieza buscarPieza(Long codigo);
	
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void eliminarPieza(Long codigo);
}
