package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	private long id;
	private String namaDepan;
	private String namaBelakang;
	private String emailSw;
	private String jurusan;
	private String nomor;
	
	public Student() {}
	
	
	public Student(String namaDepan, String namaBelakang, String emailSw, String jurus, String nomor) {
		this.namaDepan = namaDepan;
		this.namaBelakang = namaBelakang;
		this.emailSw = emailSw;
		this.jurusan = jurus;
		this.nomor = nomor;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name ="nama_depan", nullable = false)
	public String getNamaDepan() {
		return namaDepan;
	}
	public void setNamaDepan(String firstName) {
		this.namaDepan = firstName;
	}
	
	@Column(name ="nama_belakang", nullable = false)
	public String getNamaBelakang() {
		return namaBelakang;
	}
	public void setNamaBelakang(String lastName) {
		this.namaBelakang = lastName;
	}
	
	@Column(name ="email_address", nullable = false)
	public String getEmailSw() {
		return emailSw;
	}
	public void setEmailSw(String emailSw) {
		this.emailSw = emailSw;
	}
	
	@Column(name ="jurusan", nullable = false)
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurus) {
		this.jurusan = jurus;
	}
	
	@Column(name ="nomor", nullable = false)
	public String getNomor() {
		return nomor;
	}
	public void setNomor(String nomor) {
		this.nomor = nomor;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", namaDepan=" + namaDepan + ", namaBelakang=" + namaBelakang + ", emailSw=" + emailSw
				 + ", jurusan=" + jurusan + "]";
	}

}

