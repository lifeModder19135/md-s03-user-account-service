package com.mdspicesmicro.userprofileservice.service;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.Theme;
import com.mdspicesmicro.userprofileservice.model.user_aggregate.User;

import java.nio.file.Path;

public interface UserAccountService {
    Account createNewAccountForUnregisteredUser(Long userId, String uname, String hashedPwd, Path profilePicture,
                                                       String biotext, Boolean twostp, Boolean privacyEnabled, Theme theme);

    User createNewUser();
}
