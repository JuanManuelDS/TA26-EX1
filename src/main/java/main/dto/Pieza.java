package main.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="piezas")
public class Pieza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column
	private String nombre;
	
	@OneToMany(mappedBy = "pieza", cascade = CascadeType.ALL)
	private List<Suministra> suministra;

	public Pieza() {
		// TODO Auto-generated constructor stub
	}

	public Pieza(Long codigo, String nombre, List<Suministra> suministra) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.suministra = suministra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Suministra> getSuministra() {
		return suministra;
	}

	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	public Long getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Pieza [codigo=" + codigo + ", nombre=" + nombre + ", suministra=" + suministra + "]";
	}
	
	
}
