package com.capstone.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "job_table")
public class JobList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "description")
	private String description;

	@Column(name = "salary")
	private double salary;

	@Column(name = "title")
	private String title;

	@Column(name = "dateposted")
	private Date dateposted;

	@Column(name = "status")
	private String status;

	@Column(name = "skills")
	private String skills;

	@Column(name = "job_type")
	private String jobType;
	
	
	
	@Column(name = "contract_duration")
	private String contractDuration;
	
	@Column(name = "experience")
	private String experience;
	
	
	
	

	public JobList() {

	}

	public JobList(Integer id, String description, double salary, String title, Date dateposted, String status,
			String skills, String jobType) {
		super();
		this.id = id;
		this.description = description;
		this.salary = salary;
		this.title = title;
		this.dateposted = dateposted;
		this.status = status;
		this.skills = skills;
		this.jobType = jobType;
	}

	@Override
	public String toString() {
		return "JobList [id=" + id + ", description=" + description + ", salary=" + salary + ", title=" + title
				+ ", dateposted=" + dateposted + ", status=" + status + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateposted() {
		return dateposted;
	}

	public void setDateposted(Date dateposted) {
		this.dateposted = dateposted;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	
	

	public String getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}
