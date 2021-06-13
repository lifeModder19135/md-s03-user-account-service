package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Table(name="ACCOUNT_PREFS")
@Builder
class UserAccountPreferences {

   
	
	
//    UserAccountPreferences(Long id, Boolean twostp, Boolean privacyEnabled,  Theme theme) {
//    	this.twoStepVerifyEnabled = twostp;
//    	this.detailsPrivate = privacyEnabled;
//    	this.preferredTheme = theme;
//    	this.accountId = id;
//    }
   
    @Id
	private final Long accountId;
    
    @Column(name="two-step-verify-on")
    private Boolean twoStepVerifyEnabled;

    @Column(name="privacyOn")
    private Boolean detailsPrivate;
    
    @Column(name="theme")
    private Theme preferredTheme;


}