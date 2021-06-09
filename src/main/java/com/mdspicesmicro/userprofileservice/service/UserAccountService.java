package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;

public interface UserAccountService {
	
	Account createNewAccountForUnregisteredUser(user);
		
	
	Account createNewAccountForRegisteredUser();

}
