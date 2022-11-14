package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.ISuministraDAO;
import main.dto.Suministra;

@Service
public class SuministraService implements ISuministraService {

	@Autowired
	ISuministraDAO iSuministraDAO;

	@Override
	public List<Suministra> listarSuministra() {
		
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra buscarSuministra(Long id) {
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(Long id) {
		 iSuministraDAO.deleteById(id);
	}
}
