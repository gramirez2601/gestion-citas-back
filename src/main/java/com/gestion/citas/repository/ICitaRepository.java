package com.gestion.citas.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.gestion.citas.models.entity.Cita;
import com.gestion.citas.models.entity.Consultorio;
import com.gestion.citas.models.entity.Doctor;

/**
 * @author guill
 *
 */
@Repository
public interface ICitaRepository extends CrudRepository<Cita, Long>{

	List<Cita> findByHorario(Date horario);
	List<Cita> findByConsultorio(Consultorio consultorio);
	List<Cita> findByDoctor(Doctor doctor);
	List<Cita> findByDoctorAndHorario(Doctor doctor, Date date);

}
