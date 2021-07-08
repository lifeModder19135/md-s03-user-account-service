package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;

public interface UserAccountIntegrationService {j
	
	
	
	Account registerAndCreateNewAccountForUnregisteredUser();
		
	
	Account createNewAccountForRegisteredUser();

}
