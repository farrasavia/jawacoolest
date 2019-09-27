package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lecture")
public class Lecture {

	private long id;
	private String kdDosen;
	private String namaDosen;
	private String alamat;
	private String mataKuliah; 
	
	
	public Lecture() {
		
	}
	
	public Lecture(String kdDosen, String namaDosen, String alamat, String mataKuliah) {
		this.kdDosen = kdDosen;
		this.namaDosen = namaDosen;
		this.alamat = alamat;
		this.mataKuliah = mataKuliah;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "kd_Dosen", nullable = false)
	public String getkdDosen() {
		return kdDosen ;
	}
	public void setkdDosen(String kdDosen) {
		this.kdDosen = kdDosen;
	}
	
	@Column(name = "nama_Dosen", nullable = false)
	public String getnamaDosen() {
		return namaDosen;
	}
	public void setnamaDosen(String namaDosen) {
		this.namaDosen = namaDosen;
	}
	
	@Column(name = "alamat", nullable = false)
	public String getalamat() {
		return alamat;
	}
	public void setalamat(String alamat) {
		this.alamat = alamat;
	}
	
	@Column(name = "mata_Kuliah", nullable = false)
	public String getmataKuliah() {
		return mataKuliah;
	}
	public void setmataKuliah(String mataKuliah) {
		this.mataKuliah = mataKuliah;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", kdDosen=" + kdDosen + ", namaDosen=" + namaDosen + ", alamat=" + alamat
				+ ",mataKuliah=" +mataKuliah +"]";
	}
	
}
