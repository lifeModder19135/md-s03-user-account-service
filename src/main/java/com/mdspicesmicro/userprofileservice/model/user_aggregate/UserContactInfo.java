package com.mdspicesmicro.userprofileservice.model.user_aggregate;


import javax.persistence.Embeddable;
import javax.validation.constraints.Email;

@Embeddable
class UserContactInfo {

    
    UserContactInfo() {
    }

    
    private Long userId;

    
    private Email primaryEmail;

    
    private Email secondaryEmail;

    
    private PhoneNumber primaryPhone;

    
    private PhoneNumber secondaryPhone;

    
    private String facebookAddress;

    
    private String twitterId;


}