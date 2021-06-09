package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.UserAccountPreferences;

public class ImplUserAccountService implements UserAccountService {

	@Override
	public Account createNewAccountForUnregisteredUser(String userId) {
		// TODO
		Account acct = Account.builder().acctPrefs(null). .build();
		return acct;
	}

	@Override
	public Account createNewAccountForRegisteredUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
