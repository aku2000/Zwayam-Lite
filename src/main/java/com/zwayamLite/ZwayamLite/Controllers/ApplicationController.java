package com.zwayamLite.ZwayamLite.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zwayamLite.ZwayamLite.Models.Application;
import com.zwayamLite.ZwayamLite.Models.ApplicationId;
import com.zwayamLite.ZwayamLite.Services.ApplicationService;

@RestController
public class ApplicationController {
	
	@Autowired
	ApplicationService applicationService;
	
	@GetMapping("/applied/{appl_id}")
	public Application appliedJob(@PathVariable ApplicationId appl_id){
		return applicationService.getJobsByAppl_Id(appl_id);
	}
	
	
	
	
}
