package com.gestion.citas.service;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.gestion.citas.models.entity.Cita;
import com.gestion.citas.models.entity.Consultorio;
import com.gestion.citas.models.entity.Doctor;

public interface iCitaService {

	ResponseEntity<Cita> agendar(Cita cita);
	List<Cita> findByHorario(Date horario);
	List<Cita> findByConsultorio(Consultorio consultorio);
	List<Cita> findByDoctor(Doctor doctor);
	List<Cita> findByDoctorAndDate(Doctor doctor, Date date);

}
