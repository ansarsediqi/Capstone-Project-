package com.capstone.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicant_table")

public class Applicant {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "address")
	private String address;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "degree_name")
	private String degreeName;

	@Column(name = "degree_type")
	private String degreeType;

	@Column(name = "institution_university")
	private String institutionUniversity;

	@Column(name = "skill_name")
	private String skillName;

	@Column(name = "workplace_name")
	private String workplaceName;

	@Column(name = "position")
	private String position;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "stillworking")
	private String stillworking;

	public Applicant() {
	}

	public Applicant(Integer id, String firstName, String lastName, String address, String email, String password,
			String degreeName, String degreeType, String institutionUniversity, String skillName, String workplaceName,
			String position, Date startDate, String stillworking) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.password = password;
		this.degreeName = degreeName;
		this.degreeType = degreeType;
		this.institutionUniversity = institutionUniversity;
		this.skillName = skillName;
		this.workplaceName = workplaceName;
		this.position = position;
		this.startDate = startDate;
		this.stillworking = stillworking;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	public String getInstitutionUniversity() {
		return institutionUniversity;
	}

	public void setInstitutionUniversity(String institutionUniversity) {
		this.institutionUniversity = institutionUniversity;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStillworking() {
		return stillworking;
	}

	public void setStillworking(String stillworking) {
		this.stillworking = stillworking;
	}

	@Override
	public String toString() {
		return "Applicant [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", email=" + email + ", password=" + password + ", degreeName=" + degreeName + ", degreeType="
				+ degreeType + ", institutionUniversity=" + institutionUniversity + ", skillName=" + skillName
				+ ", workplaceName=" + workplaceName + ", position=" + position + ", startDate=" + startDate
				+ ", stillworking=" + stillworking + "]";
	}

}
