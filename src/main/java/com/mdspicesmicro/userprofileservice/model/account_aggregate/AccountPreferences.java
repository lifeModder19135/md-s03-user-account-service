package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.util.Map;

class AccountPreferences {


    AccountPreferences() {
    }

    @ManyToOne
    private AppViewTheme appViewTheme;

    
    private Boolean twoStepVerifyEnabled;

    
    private Boolean detailsPrivate;
    
    
    private Map<String, String> securityQuestionsAndAnswers;


}