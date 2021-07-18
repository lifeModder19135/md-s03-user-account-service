package com.mdspicesmicro.userprofileservice.service;

import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.AccountFactoryImpl;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.Theme;
import com.mdspicesmicro.userprofileservice.model.user_aggregate.User;
import com.mdspicesmicro.userprofileservice.model.user_aggregate.UserFactoryImpl;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	AccountFactoryImpl aFactory;
	
	@Autowired
	UserFactoryImpl uFactory;
	
	
	
	@Override
	public Account createNewAccountForUnregisteredUser(String uname, String hashedPwd, Path profilePicture,
													   String biotext, Boolean twostp, Boolean privacyEnabled, Theme theme) {

//		- create new User
//		- get user id
//		- create new account(userid, ...)
	}

	public Account createNewAccountForRegisteredUser(String uname, String hashedPwd, Path profilePicture,
			   																					  String biotext, Boolean twostp, Boolean privacyEnabled, Theme theme) {
		
		return null;
	}
	
	public User createNewUser(){
		return new User();
	}

	@Override
	public Account createNewAccountForUnregisteredUser(Long userId, String uname, String hashedPwd, Path profilePicture,
			String biotext, Boolean twostp, Boolean privacyEnabled, Theme theme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createNewUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
