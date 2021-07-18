package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.nio.file.Path;

public interface AccountFactory {
	
	Account createAccount(Long userId, String uname, String hashedPwd, Path profilePicture, String biotext, Boolean twostp, Boolean privacyEnabled,  Theme theme);
	

}
