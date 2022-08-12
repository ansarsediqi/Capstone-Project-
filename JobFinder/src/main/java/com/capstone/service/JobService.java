package com.capstone.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.JobList;
import com.capstone.repository.JobListRepository;

import java.util.*;

@Service
@Transactional
public class JobService {

	@Autowired
	private JobListRepository jobRepository;

	public Optional<JobList> getJobById(int id) {
		return jobRepository.findById(id);
	}

	public List<JobList> search(String keyword) {
		List<JobList> matches = new LinkedList<>();
		for (JobList temp : jobRepository.findAll()) {
			if (temp.getJobType().equalsIgnoreCase(keyword) || temp.getExperience().equalsIgnoreCase(keyword)
					//|| temp.getGender().equalsIgnoreCase(keyword) || temp.getSkills().equalsIgnoreCase(keyword)
					|| temp.getContractDuration().equalsIgnoreCase(keyword)) {
				matches.add(temp);
			}
		}
		return matches;
	}

	public void removeJobById(JobList job) {
		jobRepository.deleteById(job.getId());
	}

	public void removeAllJobs() {
		jobRepository.deleteAll();
	}

	public void saveJobItems(List<JobList> jobItems) {
		jobRepository.saveAll(jobItems);
	}

	public void saveJob(JobList job) {
		jobRepository.save(job);
	}

	public List<JobList> findAllJobs() {
		return jobRepository.findAll();
	}

	public void editJob(JobList job) {
		Optional<JobList> foundJob = jobRepository.findById(job.getId());
		if (foundJob.isPresent()) {
			foundJob.get().setContractDuration(job.getContractDuration());
			foundJob.get().setDateposted(job.getDateposted());
			foundJob.get().setDescription(job.getDescription());
			foundJob.get().setExperience(job.getExperience());
			foundJob.get().setId(job.getId());
			foundJob.get().setJobType(job.getJobType());
			foundJob.get().setSalary(job.getSalary());
			foundJob.get().setSkills(job.getSkills());
			foundJob.get().setStatus(job.getStatus());
			jobRepository.save(foundJob.get());
		}

	}
}
