package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;

public interface UserAccountService {j
	
	Account createNewAccountForUnregisteredUser(user);
		
	
	Account createNewAccountForRegisteredUser();

}
