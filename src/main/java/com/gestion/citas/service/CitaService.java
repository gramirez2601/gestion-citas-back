/**
 * 
 */
package com.gestion.citas.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gestion.citas.models.entity.Cita;
import com.gestion.citas.models.entity.Consultorio;
import com.gestion.citas.models.entity.Doctor;
import com.gestion.citas.repository.ICitaRepository;

/**
 * @author guill
 *
 */
@Service
public class CitaService implements iCitaService {

	@Autowired
	private ICitaRepository repository;
	
	@Override
	public ResponseEntity<Cita> agendar(Cita cita) {
		Cita save = repository.save(cita);
		return ResponseEntity.ok(save);
	}

	@Override
	public List<Cita> findByHorario(Date horario) {
		return repository.findByHorario(horario);
	}

	@Override
	public List<Cita> findByConsultorio(Consultorio consultorio) {
		return repository.findByConsultorio(consultorio);
	}

	@Override
	public List<Cita> findByDoctor(Doctor doctor) {
		return repository.findByDoctor(doctor);	
	}

	@Override
	public List<Cita> findByDoctorAndDate(Doctor doctor, Date date) {
		return repository.findByDoctorAndHorario(doctor, date);
	}

}
