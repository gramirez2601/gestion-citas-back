/**
 * 
 */
package com.gestion.citas.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gestion.citas.models.entity.Cita;
import com.gestion.citas.models.entity.Consultorio;
import com.gestion.citas.models.entity.Doctor;
import com.gestion.citas.service.iCitaService;

/**
 * @author guill
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/api/citas/")
public class CitasController {

	@Autowired
	iCitaService service;
	
	@PostMapping("/agendar")
	public ResponseEntity<Cita> agendar(@RequestBody Cita cita){
		return service.agendar(cita);
	}
	
	@PostMapping("/findByHorario")
	public List<Cita> findByHorario(@RequestParam("date") Date date){
		return service.findByHorario(date);
	}
	
	@PostMapping("/findByConsultorio")
	public List<Cita> findByConsultorio(@RequestBody Consultorio consultorio) {
		return service.findByConsultorio(consultorio);
	}
	
	@PostMapping("/findByDoctor")
	public List<Cita> findByDoctor(@RequestBody Doctor doctor) {
		return service.findByDoctor(doctor);
	}
	
	@PostMapping("/findByDoctorAndDate")
	public List<Cita> findByDoctorAndDate(@RequestBody Doctor doctor, @RequestParam("date") Date date) {
		return service.findByDoctorAndDate(doctor, date);
	}
	
}
