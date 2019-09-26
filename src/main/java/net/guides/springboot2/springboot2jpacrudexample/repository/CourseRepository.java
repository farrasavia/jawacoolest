package net.guides.springboot2.springboot2jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Course;
//import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}