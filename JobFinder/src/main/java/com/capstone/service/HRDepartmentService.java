package com.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.capstone.entity.Applicant;
import com.capstone.entity.HRDepartment;
import com.capstone.entity.JobList;
import com.capstone.repository.HRDepartmentRepository;

@Service
public class HRDepartmentService {

	@Autowired
	HRDepartmentRepository hrRepository;
	// methods go here (findAll, deleteByID, etc.)

//		public Applicant findOneByUsername(String username);
//		
//		public long countByUsernameAndPassword( String username, String password );
//		
//		public long countByUsername( String username );
	public void addJobs(HRDepartment hr) {
		hr.getJob_table();
		HRDepartment hr1 = new HRDepartment();
		hr1.setEmail(hr.getEmail());
		hr1.setFirst_name(hr.getFirst_name());
		hr1.setLast_name(hr.getLast_name());
		hr1.setPassword(hr.getPassword());
		hr1.setJob_table(hr.getJob_table());
		hrRepository.save(hr1);
	}

	public HRDepartment findByEmail(String email) {
		HRDepartment found = hrRepository.findByEmail(email);
		return found;
	}

	public HRDepartment loginRepresentative(HRDepartment representative) {
		return hrRepository.loginRep(representative.getEmail(), representative.getPassword());
	}
}
