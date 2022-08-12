package com.capstone.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capstone.entity.Applicant;
import com.capstone.entity.HRDepartment;
import com.capstone.entity.JobList;
import com.capstone.service.ApplicantService;
import com.capstone.service.HRDepartmentService;
import com.capstone.service.JobService;

@Controller
public class MainController {

	@Autowired
	ApplicantService applicantService;

	@Autowired
	HRDepartmentService hrService;

	@Autowired
	JobService jobService;

	@GetMapping("/")
	public String welcome(Model model, HttpSession session) {
		return "index";

	}

	@GetMapping("/sign-up")
	public ModelAndView signUp(Model model) {
		return new ModelAndView("sign-up", "applicantservice", new Applicant());
	}

	@PostMapping("/sign-up")
	public String handleSignUp(Model model, @ModelAttribute("applicantservice") Applicant applicant,
			HttpSession session) {
		applicantService.createNewApplicantInDB(applicant);
		System.out.println(applicantService);
		model.addAttribute("newApplicantService", applicantService);
		return "thank-you";
	}

	@GetMapping("/login")
	public ModelAndView login(Model model) {
		return new ModelAndView("login", "applicant", new Applicant());
	}

	@PostMapping("/login")
	public String handleLogin(Model model, @ModelAttribute("applicant") Applicant applicant, HttpSession session) {
		if (applicantService.loginApplicant(applicant) != null) {
			model.addAttribute("setApplicant", applicant);
			model.addAttribute("jobList", jobService.findAllJobs());
			return "profile";
		} else {

			model.addAttribute("msg", "Invalid login, please try again");
			return "login";
		}
	}

	@GetMapping("/edit")
	public String editJob(@RequestParam int id, Model model, HttpSession session) {

		JobList foundJob = jobService.getJobById(id).get();

		model.addAttribute("jobList", foundJob);

		return "EditJob";
	}

	@PostMapping("/edit")
	public String editJob(@ModelAttribute("jobList") JobList job, Model model, HttpSession session) {

		System.out.println(job.getId());
		jobService.editJob(job);

		model.addAttribute("jobList", jobService.findAllJobs());

		return "hrprofile";
	}

	@GetMapping("/hr/add-job")
	public String addJob(Model model, HttpSession session) {

		model.addAttribute("jobList", new JobList());

		return "addjob";
	}

	@PostMapping("/hr/add-job")
	public String addJob(Model model, @ModelAttribute("jobList") JobList jobList, HttpSession session) {

		jobService.saveJob(jobList);
		List<JobList> listOfJobs = jobService.findAllJobs();
		model.addAttribute("jobList", jobService.findAllJobs());
		return "hrprofile";
	}

	@GetMapping("/hr/find-by-email")
	public String findByEmail(Model model, String email, HttpSession session) {
		HRDepartment found = hrService.findByEmail(email);
		model.addAttribute("hrUser", found);
		return "profile";
	}

	@GetMapping("/search")
	public String search(Model model, HttpSession session) {
		return "search";
	}

	@PostMapping("/search")
	String handleSearch(@RequestParam String keyword, Model model, HttpSession session) {
		List<JobList> matches = jobService.search(keyword);
		model.addAttribute("matches", matches);
		model.addAttribute("msg", "Sorry, no results found, Please try again");
		return "results";
	}

	@GetMapping("/details")
	public String detail(@RequestParam int id, Model model, HttpSession session) {
		Optional<JobList> jobFound = jobService.getJobById(id);
		model.addAttribute("listing", jobFound.get());
		return "details";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam Integer id, Model model, HttpSession session) {
		Optional<JobList> jobFound = jobService.getJobById(id);
		jobService.removeJobById(jobFound.get());
		model.addAttribute("jobList", jobService.findAllJobs());

		return "hrprofile";
	}

	@GetMapping("/hrlogin")
	public ModelAndView hrlogin(Model model) {
		return new ModelAndView("hrlogin", "hrrepresentative", new HRDepartment());
	}

	@PostMapping("/hrlogin")
	public String handleLogin(Model model, @ModelAttribute("hrrepresentative") HRDepartment representative,
			HttpSession session) {
		if (hrService.loginRepresentative(representative) != null) {
			model.addAttribute("setRepresentative", representative);
			model.addAttribute("jobList", jobService.findAllJobs());
			return "hrprofile";
		} else {

			model.addAttribute("msg", "Invalid login, please try again");
			return "login";

		}
	}

	@GetMapping("/contact")
	public String contact(Model model, HttpSession session) {
		return "contact";
	}
}
