package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Long> {

}
