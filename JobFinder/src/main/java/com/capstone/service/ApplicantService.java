package com.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.Applicant;
import com.capstone.repository.ApplicantRepository;

@Service
public class ApplicantService {

	@Autowired
	ApplicantRepository applicantRepository;

	public void updateApplicantProfile(Applicant applicantFormData) {

		Applicant applicantDB = applicantRepository.findByEmail(applicantFormData.getEmail());

		// Update only selected fields. Password is not updated

		// applicantDB.setNames(applicantFormData.getNames());
		applicantDB.setDegreeName(applicantFormData.getDegreeName());
		applicantDB.setAddress(applicantFormData.getAddress());
		applicantDB.setDegreeType(applicantFormData.getDegreeType());
		applicantDB.setEmail(applicantFormData.getEmail());
		applicantDB.setFirstName(applicantFormData.getFirstName());
		applicantDB.setSkillName(applicantFormData.getSkillName());
		applicantDB.setInstitutionUniversity(applicantFormData.getInstitutionUniversity());
		applicantDB.setLastName(applicantFormData.getLastName());
		applicantDB.setPosition(applicantFormData.getPosition());

		applicantRepository.save(applicantDB);

	}

	public void createNewApplicantInDB(Applicant applicant) {

		applicantRepository.save(applicant);
	}

	public Applicant loginApplicant(Applicant applicant) {
		return applicantRepository.loginApplicant(applicant.getEmail(), applicant.getPassword());
	}
}
