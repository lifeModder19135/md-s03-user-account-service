package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.ImplAccountFactory;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Path;

@Service
public class ImplUserAccountService implements UserAccountService {

	@Autowired
	ImplAccountFactory factory;
	@Override
	public Account createNewAccountForUnregisteredUser(Long userId, String uname, String hashedPwd, Path profilePicture,
													   String biotext, Boolean twostp, Boolean privacyEnabled, Theme theme) {
		// TODO

		Account acct = factory.buildAcct(userId, uname, hashedPwd, profilePicture, biotext, twostp, privacyEnabled, theme);
		return acct;
	}


	public Account createNewAccountForRegisteredUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
