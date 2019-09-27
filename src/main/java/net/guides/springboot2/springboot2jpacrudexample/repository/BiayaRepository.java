package net.guides.springboot2.springboot2jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Biaya;
//import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
//import net.guides.springboot2.springboot2jpacrudexample.model.Course;

@Repository
public interface BiayaRepository extends JpaRepository<Biaya, Long> {

}
