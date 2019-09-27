package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	private long id;
	private String courseCode;
	private String courseName;
	private int semester;
	private String courseStatus;
	public Course() {}
	public Course(String courseCode, String courseName, Integer semester, String courseStatus) {
		
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.semester = semester;
		this.courseStatus = courseStatus;		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	


	@Column(name = "course_code", nullable = false)
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Column(name = "course_name", nullable = false)
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Column(name = "semester", nullable = false)
	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Column(name = "course_status", nullable = false)
	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}
	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	
//	@Column(name = "first_name", nullable = false)
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	
//	@Column(name = "last_name", nullable = false)
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	
//	@Column(name = "email_address", nullable = false)
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}

	public String toString() {
		return "Employee [id = " + id + ", Code = " + courseCode + ", Course = " + courseName + ", Semester = " + semester+ ", Status = "+courseStatus+ "]";
	}
}
