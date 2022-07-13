package com.zwayamLite.ZwayamLite.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwayamLite.ZwayamLite.Models.Application;
import com.zwayamLite.ZwayamLite.Models.ApplicationId;
import com.zwayamLite.ZwayamLite.Repository.ApplicationRepsoitory;

@Service
public class ApplicationService {
	
	@Autowired
	ApplicationRepsoitory applicationRepsoitory;

	
	public Application getJobsByAppl_Id(ApplicationId appl_id) {
		return applicationRepsoitory.findByAppl_id(appl_id);
	}
	


}
