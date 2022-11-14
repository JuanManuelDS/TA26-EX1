package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, String>{

}
