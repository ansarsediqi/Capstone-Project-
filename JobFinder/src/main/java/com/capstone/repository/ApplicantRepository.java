package com.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.entity.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Integer>{

	
	@Query("SELECT a FROM Applicant a WHERE a.email =?1")
	Applicant findByEmail(String email);
	
	@Query("SELECT a FROM Applicant a WHERE a.email =?1 AND a.password =?2")
	Applicant loginApplicant(String email, String password);
}
