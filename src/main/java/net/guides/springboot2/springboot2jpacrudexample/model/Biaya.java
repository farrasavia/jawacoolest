package net.guides.springboot2.springboot2jpacrudexample.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "biaya")

public class Biaya {

	private long id;
	private String nama;
	private String semesterBiaya;
	private int gajiOrtu;
	private String tunggakan;
	
	public Biaya(String nama, String semesterBiaya, Integer gajiOrtu, String tunggakan) {
		
		this.nama = nama;
		this.semesterBiaya = semesterBiaya;
		this.gajiOrtu = gajiOrtu;
		this.tunggakan = tunggakan;		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	


	@Column(name = "nama_Mhs", nullable = false) //isi field GETTER SETTER
	public String getNama() { //GETTER
		return nama;
	}

	public void setNama(String Nama) { //SETTER
		this.nama = Nama;
	}

	@Column(name = "semester_Biaya", nullable = false)
	public String getSemester() {
		return semesterBiaya;
	}

	public void setSemester(String Semester) {
		this.semesterBiaya = Semester;
	}

	@Column(name = "gajiOrtu", nullable = false)
	public int getGaji() {
		return gajiOrtu;
	}

	public void setGaji(int Gaji) {
		this.gajiOrtu = Gaji;
	}

	@Column(name = "tunggakan", nullable = false)
	public String getTunggakan() {
		return tunggakan;
	}

	public void setTunggakan(String Tunggakan) {
		this.tunggakan = Tunggakan;
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
		return "Employee [id = " + id + ", Code = " + nama + ", Course = " + semesterBiaya + ", Semester = " + gajiOrtu+ ", Status = "+tunggakan+ "]";
	}
}

