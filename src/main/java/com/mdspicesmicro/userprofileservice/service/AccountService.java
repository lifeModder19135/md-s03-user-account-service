package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;

interface AccountService {
	
	/*TODO
	 *    !!! private scope -- only accessed by other class methods  !!!
	 *    
	 *    01 build create method for Credentials (id, uname, pwd)
	 *    02 build create method for UserProfileInfo (Id, path pic, str bioText)
	 *    03 build create method for Credit (id)
	 *    04 build create method for acctState (id)
	 *    05 build create method for acctPrefs (id, 2stp, privacy, theme)
	 * X 06 build create method for Account ()
	 * 
	 *   ~~ public interface ~~
	 * 
	 *   07 build create method for Account (uname, pwd, picpath, bioText, 2stp, privacy, theme)
	 *
	 *   08 build update method for Account (id, uname)
	 *   09 build update method for Account (id, pwd)
	 *   10 build update method for Account (id, picpath)
	 *   11 build update method for Account (id, bioText)
	 *   12 build update method for Account (id, 2stp)
	 *   13 build update method for Account (id, privacy)
	 *   14 build update method for Account (id, theme)
	 * 
	 *  !!! private scope -- only accessed by other class methods  !!!
	 * 
	 *   15 build update method for Credentials (id, uname, pwd)
	 *   16 build update method for Credentials (id, uname, pwd)
	 * 
	 *   17 build update method for UserProfileInfo (Id, picpath, bioText)
	 *   18 build update method for UserProfileInfo (Id, picpath, bioText)
	 * 
	 *   19 build update method for Credit (id)
	 *   20 build update method for acctState (id)
	 *   21 build create method for acctPrefs (id, 2stp, privacy, theme) 
	 * 
	 */
	
	
	private Account createEmptyAccountWithId() {
		return new Account();
	};
	
	private Account addCredentialsToAccountById(Long id, String uname, String hashedPwd) {
		Account acct = createEmptyAccountWithId();
		Account.builder().acctPrefs(new UserAccountPreferences).build();
	}; 
	
	

}
