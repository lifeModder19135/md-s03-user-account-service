package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

import org.springframework.data.annotation.Id;


@Data
@Table("CREDIT")
public class Credit {

    /**
     * Default constructor
     */
    public Credit() {
    	this.amount = 0.00;
    	this.status = "status.PENDING";
    }
    
    @Id
	@Column(value="account_id")
    private Long userId;
    
    @Column(value="amount")
    private double amount;
    
    @Column(value="account_id")
    private CreditStatus status;


}