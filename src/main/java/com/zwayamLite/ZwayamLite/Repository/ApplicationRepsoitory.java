package com.zwayamLite.ZwayamLite.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sun.istack.Nullable;
import com.zwayamLite.ZwayamLite.Models.Application;
import com.zwayamLite.ZwayamLite.Models.ApplicationId;

public interface ApplicationRepsoitory extends JpaRepository<Application, ApplicationId>{

	@Nullable
	Application findByAppl_id(ApplicationId appl_id);

}
