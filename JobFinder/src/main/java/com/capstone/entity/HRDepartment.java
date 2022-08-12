package com.capstone.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hr_dept_tb")
public class HRDepartment {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@OneToMany
	@JoinColumn(name = "job_id")
	private List<JobList> job_table;

	public HRDepartment() {

	}

	public HRDepartment(Integer id, String email, String password, String first_name, String last_name,
			List<JobList> job_table) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.job_table = job_table;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public List<JobList> getJob_table() {
		return job_table;
	}

	public void setJob_table(List<JobList> job_table) {
		this.job_table = job_table;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "HRDepartment [id=" + id + ", email=" + email + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", job_table=" + job_table + "]";
	}

}
