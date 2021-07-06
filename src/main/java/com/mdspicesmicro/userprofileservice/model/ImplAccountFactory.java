package com.mdspicesmicro.userprofileservice.model;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;
import com.mdspicesmicro.userprofileservice.model.account_aggregate.Theme;

import java.nio.file.Path;

public class ImplAccountFactory implements AccountFactory{
    @Override
    public Account buildAcct(Long userId, String uname, String hashedPwd, Path profilePicture, String biotext, Boolean twostp, Boolean privacyEnabled, Theme theme) {
        Account acct = new Account(userId, uname, hashedPwd, profilePicture, biotext, twostp, privacyEnabled, theme);
        return acct;
    }
}
