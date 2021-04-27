package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.data.relational.core.mapping.Column;

public class User {

	
    public User() {
    	
    }

    @Column(value="USER_ID")
    private Long userId;

    @Column(value="USER_ROLE")
    private UserRole userRole;
    
    @Column(value="USER_STATUS")
    private UserStatus status;

    @OneToOne(optional=false)
    @JoinColumn(name="USER_ID", unique=true, nullable=false, updatable=true)
    private UserDetails details;
    
    @OneToOne(optional=false)
    @JoinColumn(name="USER_ID", unique=true, nullable=false, updatable=true)
    private UserContactInfo ContactInfo;
        
    @OneToOne(optional=false)
    @JoinColumn(name="USER_ID", unique=true, nullable=false, updatable=true)
    private UserActivityMetrics activity;

    @OneToOne(optional=false)
    @JoinColumn(name="USER_ID", unique=true, nullable=false, updatable=true)
    private UserDevices devices;

    @OneToMany()
    @PrimaryKeyJoinColumn(name="ADRESSEE")
    private List<Address> assocAddresses;



}