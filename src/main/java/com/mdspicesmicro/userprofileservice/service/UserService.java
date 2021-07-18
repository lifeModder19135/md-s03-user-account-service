package com.mdspicesmicro.userprofileservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mdspicesmicro.userprofileservice.model.user_aggregate.User;
import com.mdspicesmicro.userprofileservice.model.user_aggregate.UserRepository;

public class UserService {
	
	@Autowired
	UserRepository ur;
	
	

	public UserService() {
	
		
		
		
	}
	
	// tests a uid to see if it is in DB
	public Boolean isUser(Long uid) {
		
		User itis = ur.findById(uid);
		if( itis == null) {
			return false;
		}else {
			return true;
		}
	}
}
