package com.gestion.citas.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author guill
 *
 */
@Entity
@Table(name = "consultorio")
public class Consultorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroConsultorio;
	
	@Column(name = "piso")
	private Integer piso;

	public Consultorio() {}
	
	public Consultorio(Long numeroConsultorio, Integer piso) {
		super();
		this.numeroConsultorio = numeroConsultorio;
		this.piso = piso;
	}

	public Long getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(Long numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}
}
