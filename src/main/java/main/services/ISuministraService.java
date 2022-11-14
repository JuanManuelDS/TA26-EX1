package main.services;

import java.util.List;

import main.dto.Suministra;

public interface ISuministraService {

	public List<Suministra> listarSuministra();
	
	public Suministra buscarSuministra(Long id);
	
	public Suministra guardarSuministra(Suministra suministra);
	
	public Suministra actualizarSuministra(Suministra suministra);
	
	public void eliminarSuministra(Long id);
}
