package com.capstone.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capstone.entity.HRDepartment;

@Repository
public interface HRDepartmentRepository extends JpaRepository<HRDepartment, Integer> {

	@Query("SELECT h from HRDepartment h WHERE h.email =?1")
	HRDepartment findByEmail(String email);

	@Query("SELECT h FROM HRDepartment h WHERE h.email =?1 AND h.password =?2")
	HRDepartment loginRep(String email, String password);
}
