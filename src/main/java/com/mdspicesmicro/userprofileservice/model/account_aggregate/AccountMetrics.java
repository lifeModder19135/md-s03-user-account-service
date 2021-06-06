package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

//@Data
//@Table("ACCT_METRICS")
public class AccountMetrics {

    
    public AccountMetrics(Long id) {
    	this.accountId=id;
    }


    private Long accountId;


}