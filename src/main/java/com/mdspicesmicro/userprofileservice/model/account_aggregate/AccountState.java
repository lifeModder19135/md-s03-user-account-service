package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
    	//this.ageInDays = 0;
    	this.pwdStrength = null;
    	this.status = AccountStatus.PENDING;
    	this.createdDate = LocalDate.now();
    }

    @Id
    @MapsId
    @Column(value="account_id")
    private Long accountId;
    
    @Column(value="age_in_days")
    private LocalDate createdDate;
    
    @Column(value="pwd_strength")
    private String pwdStrength;
    
    @Column(value="status")
    private AccountStatus status;
    
    

    Period getPeriodOfExistance() {
    	LocalDate now = LocalDate.from(Instant.now());
    	Period timePassed = Period.between(createdDate, now);
    	return timePassed;
    }
    
    String getPeriodAsString(){
    	Period p = getPeriodOfExistance();   			    	
    	return p.toString();
    }
    
    int getAgeInDays() {
    	LocalDate now = LocalDate.now();
    	return (int) ChronoUnit.DAYS.between(createdDate, now);
    }
    
}