package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdspicesmicro.userprofileservice.model.user_aggregate.UserActivityMetrics.UserActivityMetricsBuilder;







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
    
    Logger logger = LoggerFactory.getLogger(User.class);
    
    
    User(UserRole role, String fname, String lname, int age, Gender gender, UserStatus status, Email priEmail, Email secEmail, PhoneNumber priPhone, PhoneNumber secPhone, String facebookAddr, String twitterId){
    	this.userRole = role;
    	this.details = UserDetails.builder().userId(this.userId).fName(fname).lName(lname).age(age).gender(gender).build();
    	this.userDevices = new ArrayList();
    	this.status = status;
    	this.assocAddresses =  new ArrayList();
    	this.metrics = UserActivityMetrics.builder().avgDailyImpressions(0).daysSinceLastPurchase(0).totalAmtSpent(0.00).avgOrdersPerMonth(0).mostPurchasedProductId(null).build();
    	this.contactInfo = UserContactInfo.builder().userId(this.userId).primaryEmail(priEmail).secondaryEmail(secEmail).primaryPhone(priPhone).secondaryPhone(secPhone).facebookAddress(facebookAddr).twitterId(twitterId).build();
    }
    
    void addUserDevice(Device device) {
    	try {
    		this.userDevices.add(device);
    	} catch (Exception e) {
    		logger.info( e + ": userDevices is not a list. This User object has not been properly instantiated.");
    	}  	
    	
    }
    
    void addAddress(Address address) {
    	try {
    		this.assocAddresses.add(address);
    	} catch (Exception e) {
    		logger.info(e + ": assocAddresses is not a list. This User object has not been properly instantiated.");
    	}  	
    }
    
    

}