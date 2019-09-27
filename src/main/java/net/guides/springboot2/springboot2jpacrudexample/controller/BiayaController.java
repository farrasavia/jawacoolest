package net.guides.springboot2.springboot2jpacrudexample.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
import net.guides.springboot2.springboot2jpacrudexample.model.Biaya;
//import net.guides.springboot2.springboot2jpacrudexample.model.Course;
//import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.repository.BiayaRepository;
//import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;
//import net.guides.springboot2.springboot2jpacrudexample.repository.CourseRepository;

@RestController
@RequestMapping("/api/v1")
public class BiayaController {

	@Autowired
	private BiayaRepository biayaRepository;

	@GetMapping("/Biaya")
	public List<Biaya> getAllBiaya() {
		return biayaRepository.findAll();
	}

	@GetMapping("/Biaya/{id}")
	public ResponseEntity<Biaya> getBiayaById(@PathVariable(value = "id") Long BiayaId)
			throws ResourceNotFoundException {
		Biaya biaya = biayaRepository.findById(BiayaId)
				.orElseThrow(() -> new ResourceNotFoundException("Biaya not found for this id :: " + BiayaId));
		return ResponseEntity.ok().body(biaya);
	}

	@PostMapping("/Biaya")
	public Biaya createBiaya(@Valid @RequestBody Biaya biaya) {
		return biayaRepository.save(biaya);
	}

	@PutMapping("/Biaya/{id}")
	public ResponseEntity<Biaya> updateBiaya(@PathVariable(value = "id") Long BiayaId,
			@Valid @RequestBody Biaya biayaDetails) throws ResourceNotFoundException {
		Biaya biaya = biayaRepository.findById(BiayaId)
				.orElseThrow(() -> new ResourceNotFoundException("Course not found for this id :: " + BiayaId));
		
		biaya.setNama(biayaDetails.getNama());
		biaya.setGaji(biayaDetails.getGaji());
		biaya.setSemester(biayaDetails.getSemester());
		biaya.setTunggakan(biaya.getTunggakan());
		final Biaya updatedBiaya = biayaRepository.save(biaya);
		return ResponseEntity.ok(updatedBiaya);
	}

	@DeleteMapping("/Biaya/{id}")
	public Map<String, Boolean> deleteCourse(@PathVariable(value = "id") Long BiayaId)
			throws ResourceNotFoundException {
		Biaya biaya = biayaRepository.findById(BiayaId)
				.orElseThrow(() -> new ResourceNotFoundException("Biaya not found for this id :: " + BiayaId));

		biayaRepository.delete(biaya);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
