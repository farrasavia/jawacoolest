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
import net.guides.springboot2.springboot2jpacrudexample.model.Lecture;
import net.guides.springboot2.springboot2jpacrudexample.repository.LectureRepository;

@RestController
@RequestMapping("/api/v1")
public class LectureController {
	@Autowired
	private LectureRepository lectureRepository;

	@GetMapping("/lecture")
	public List<Lecture> getAllLecture() {
		return lectureRepository.findAll();
	}

	@GetMapping("/lecture/{id}")
	public ResponseEntity<Lecture> getLectureById(@PathVariable(value = "id") Long lectureId)
			throws ResourceNotFoundException {
		Lecture lecture = lectureRepository.findById(lectureId)
				.orElseThrow(() -> new ResourceNotFoundException("Lecture not found for this id :: " + lectureId));
		return ResponseEntity.ok().body(lecture);
	}

	@PostMapping("/lecture")
	public Lecture createLecture(@Valid @RequestBody Lecture lecture) {
		return lectureRepository.save(lecture);
	}

	@PutMapping("/lecture/{id}")
	public ResponseEntity<Lecture> updateLecture(@PathVariable(value = "id") Long lectureId,
			@Valid @RequestBody Lecture lectureDetails) throws ResourceNotFoundException {
		Lecture lecture = lectureRepository.findById(lectureId)
				.orElseThrow(() -> new ResourceNotFoundException("Lecture not found for this id :: " + lectureId));

		lecture.setmataKuliah(lectureDetails.getmataKuliah());
		lecture.setalamat(lectureDetails.getalamat());
		lecture.setnamaDosen(lectureDetails.getnamaDosen());
		lecture.setkdDosen(lectureDetails.getkdDosen());
		final Lecture updatedLecture = lectureRepository.save(lecture);
		return ResponseEntity.ok(updatedLecture);
	}

	@DeleteMapping("/lecture/{id}")
	public Map<String, Boolean> deleteLecture(@PathVariable(value = "id") Long lectureId)
			throws ResourceNotFoundException {
		Lecture lecture = lectureRepository.findById(lectureId)
				.orElseThrow(() -> new ResourceNotFoundException("lecture not found for this id :: " + lectureId));

		lectureRepository.delete(lecture);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
