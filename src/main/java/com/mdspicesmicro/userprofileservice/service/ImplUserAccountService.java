package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.UserAccountPreferences;

public class ImplUserAccountService implements UserAccountService {

	
	public Account createNewAccountForUnregisteredUser(String userId) {
		// TODO
		Account acct = Account.builder()
				.userId(null)
				.credentials(null)
				.userProfileInfo(null)
				.acctPrefs(null)
				.build();
		return acct;
	}

	@Override
	public Account createNewAccountForRegisteredUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
