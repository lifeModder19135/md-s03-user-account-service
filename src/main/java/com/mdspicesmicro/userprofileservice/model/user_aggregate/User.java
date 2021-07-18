package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USERS")
public class User {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @OneToOne
    private UserDetails details;

    @ElementCollection
    private List<Device> userDevices;
    
    /*
    @OneToOne
    private UserDevices devices;
    */

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @ElementCollection
    private List<Address> assocAddresses;
    
    @Embedded
    private UserActivityMetrics metrics;

    @Embedded
    private UserContactInfo contactInfo;
    
    
    User(UserRole role, String fname, String lname, int age, Gender gender, Email priEmail, Email secEmail, PhoneNumber priPhone, PhoneNumber secPhone, String facebookAddr, String twitterId){
    	this.userRole = role;
    	this.details = UserDetails.builder().userId(this.userId).fName(fname).lName(lname).age(age).gender(gender).build();
    	this.userDevices = new ArrayList();
    	
    }

}