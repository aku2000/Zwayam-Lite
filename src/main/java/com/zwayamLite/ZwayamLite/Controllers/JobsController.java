package com.zwayamLite.ZwayamLite.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zwayamLite.ZwayamLite.Models.Jobs;
import com.zwayamLite.ZwayamLite.Services.JobsService;

import antlr.collections.List;

@RestController
public class JobsController {
	
	@Autowired
	private JobsService jobsService;
	
	@PostMapping("/jobs")
	public String createJobs(@RequestBody Jobs jobs) {
		jobsService.addJobs(jobs);
		return "The Job has been created successfully!!!";		
	}
	
	@GetMapping("/job/{id}")
	public Optional<Jobs> viewJobs(@PathVariable Integer job_id){
		return jobsService.getJobById(job_id);
	}
	
	@GetMapping("/job/{role}")
	public Iterable<Jobs> viewJobsList(@PathVariable String job_role){
		return jobsService.getJobByRole(job_role);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteJobs(Jobs jobs) {
		return jobsService.deleteJobById(jobs.getJob_id());
	}
}
