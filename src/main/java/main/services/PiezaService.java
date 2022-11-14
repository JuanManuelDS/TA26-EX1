package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IPiezaDAO;
import main.dto.Pieza;

@Service
public class PiezaService implements IPiezaService{

	@Autowired
	IPiezaDAO iPiezaDAO;
	
	@Override
	public List<Pieza> listarPiezas() {
		
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza buscarPieza(Long codigo) {
		
		return iPiezaDAO.findById(codigo).get();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(Long codigo) {
		// TODO Auto-generated method stub
		iPiezaDAO.deleteById(codigo);
	}

}
