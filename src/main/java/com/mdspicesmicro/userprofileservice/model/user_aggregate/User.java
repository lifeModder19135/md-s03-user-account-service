package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

 
    
    public User() {
    }

     
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @OneToOne
    private UserDetails details;

    @OneToMany
    @JoinColumn(name="USER_ID")
    private List<Device> userDevices;
    
    /*
    @OneToOne
    private UserDevices devices;
    */

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @OneToMany
    @JoinColumn(name="ADDRESSEE_ID")
    private List<Address> assocAddresses;
    
    @Embedded
    private UserActivityMetrics metrics;

    @Embedded
    private UserContactInfo contactInfo;

}