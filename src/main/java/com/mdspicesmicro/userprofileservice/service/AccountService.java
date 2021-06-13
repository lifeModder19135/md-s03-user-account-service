package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.user_aggregate.Account;

public interface AccountService {
	
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
	 *   08 build update method for Account (uname)
	 *   09 build update method for Account (pwd)
	 *   10 build update method for Account (picpath)
	 *   11 build update method for Account (bioText)
	 *   12 build update method for Account (2stp)
	 *   13 build update method for Account (privacy)
	 *   14 build update method for Account (theme)
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
	
	
	private Account createEmptyAccountWithId();
	
	private Account populateCredentialsForAccountById(Long id, String uname, String hashedPwd); 

}
