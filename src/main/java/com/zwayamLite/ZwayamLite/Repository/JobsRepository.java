package com.zwayamLite.ZwayamLite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.zwayamLite.ZwayamLite.Models.Jobs;

@Repository
public interface JobsRepository extends JpaRepository<Jobs,Integer>{

	@Nullable
	Iterable<Jobs> findByRole(String job_role);
	
}
