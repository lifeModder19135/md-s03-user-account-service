package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.Credentials;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.UserAccountPreferences;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.UserProfileInfo;

public class ImplUserAccountService implements UserAccountService {

	
	public Account createNewAccountForUnregisteredUser(Long userId, Credentials cred, UserProfileInfo info, UserAccountPreferences acctPrefs) {
		// TODO
		Account acct = Account.builder()
				.userId(userId)
				.credentials(cred)
				.userProfileInfo(info)
				.acctPrefs(acctPrefs)
				.build();
		return acct;
	}

	@Override
	public Account createNewAccountForRegisteredUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
