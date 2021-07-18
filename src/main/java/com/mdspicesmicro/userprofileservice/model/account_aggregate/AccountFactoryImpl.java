package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account.AccountBuilder;
import com.mdspicesmicro.userprofileservice.service.UserService;

public class AccountFactoryImpl implements AccountFactory{

	public AccountFactoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	UserService us; 
	
	@Override
	public Account createAccount(Long userId, String uname, String hashedPwd, Path profilePicture, String bioText,
			                                            Boolean twostp, Boolean privacyEnabled, Theme theme) {
		
		
		AccountBuilder acctBldr = new AccountBuilder();
		
		if(userId == null) {
			throw new IllegalArgumentException("Must provide a User ID.");
		} else {
			if(us.isUser(userId)) {
				acctBldr.userId(userId);
			} else {
				throw new IllegalArgumentException("Must provide a valid User ID.");
			}	
		}
		
		if(uname == null) {
			throw new IllegalArgumentException("Must provide a unique username.");
		} else {
		// NEEDS TO BE UNIQUE!!!
			acctBldr.uname(uname);
		}
		
		if(hashedPwd == null) {
			throw new IllegalArgumentException("Must provide a password.");
		} else {
			acctBldr.hashedPwd(hashedPwd);
		}
		
		
		// jar needs to be placed in same folder as /pics directory 
		if(profilePicture == null) {
			acctBldr.profilePicture(Paths.get("./pics/default.png"));
		} else {
			acctBldr.profilePicture(profilePicture);
		}
		
		if(bioText == null) {
			acctBldr.biotext(" ");
		} else {
			acctBldr.biotext(bioText);
		}
		
		if(twostp == null) {
			acctBldr.twostp(false);
		} else {
			acctBldr.twostp(twostp);
		}
		
		if(privacyEnabled == null) {
			acctBldr.privacyEnabled(false);
		} else {
			acctBldr.privacyEnabled(privacyEnabled);
		}
		
		if(theme == null) {
			acctBldr.theme(Theme.LIGHT_MODE);
		} else {
			acctBldr.theme(theme);
		}
		
	}

}
// userId, uname, hashedPwd, profilePicture, biotext, twostp, privacyEnabled, theme
