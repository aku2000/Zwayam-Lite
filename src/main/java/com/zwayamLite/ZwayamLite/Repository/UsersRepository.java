package com.zwayamLite.ZwayamLite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import com.zwayamLite.ZwayamLite.Models.Users;


public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	@Nullable
	Users findByEmail(String email);
}
