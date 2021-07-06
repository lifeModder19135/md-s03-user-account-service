package com.mdspicesmicro.userprofileservice.model;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.Theme;

import java.nio.file.Path;

public interface AccountFactory {
    public Account buildAcct(Long userId, String uname, String hashedPwd, Path profilePicture,
                             String biotext, Boolean twostp, Boolean privacyEnabled, Theme theme);
}
