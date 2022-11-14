package main.services;

import java.util.List;

import main.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listarProveedores();
	
	public Proveedor buscarProveedor(String id);
	
	public Proveedor guardarProveedor(Proveedor proveedor);
	
	public Proveedor actualizarProveedor(Proveedor proveedor);
	
	public void eliminarProveedor(String id);
}
