package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("ACCT_STATE")
class AccountState {

    /**
     * Default constructor
     */
    AccountState() {
    }

    @Id
    private Long accountId;


    private int ageInDays;
    
    
    private String pwdStrength;
    
    
    private AccountStatus status;


}