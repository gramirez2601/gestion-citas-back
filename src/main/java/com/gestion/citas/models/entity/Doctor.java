/**
 * 
 */
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
@Table(name = "doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDoctor;
	
	@Column(name = "nombre", length = 50)
	private String nombre;
	
	@Column(name = "apPaterno", length = 50)
	private String apPaterno;
	
	@Column(name = "apMaterno", length = 50)
	private String apMaterno;
	
	@Column(name = "especialidad", length = 50)
	private String especialidad;
	
	public Doctor() {}

	public Doctor(Long idDoctor, String nombre, String apPaterno, String apMaterno, String especialidad) {
		super();
		this.idDoctor = idDoctor;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.especialidad = especialidad;
	}

	public Long getidDoctor() {
		return idDoctor;
	}

	public void setidDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getespecialidad() {
		return especialidad;
	}

	public void setespecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
}
