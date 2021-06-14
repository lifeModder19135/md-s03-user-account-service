package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import javax.persistence.Entity;
import javax.persistence.MapsId;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table("ACCT_STATE")
class AccountState {

  
    AccountState(Long id) {
    	this.accountId = id;
    	this.ageInDays = 0;
    	this.pwdStrength = null;
    	this.status = AccountStatus.PENDING;
    }

    @Id
    @MapsId
    @Column(value="account_id")
    private Long accountId;
    
    @Column(value="age_in_days")
    private int ageInDays;
    
    @Column(value="pwd_strength")
    private String pwdStrength;
    
    @Column(value="status")
    private AccountStatus status;


}