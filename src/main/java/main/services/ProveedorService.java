package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IProveedorDAO;
import main.dto.Proveedor;

@Service
public class ProveedorService implements IProveedorService {

	@Autowired
	IProveedorDAO iProveedorDAO;

	@Override
	public List<Proveedor> listarProveedores() {
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor buscarProveedor(String id) {
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(String id) {
		iProveedorDAO.deleteById(id);
		
	}
	
	
}
