package com.mdspicesmicro.userprofileservice.model.user_aggregate;


import java.util.Optional;

import javax.persistence.Embeddable;

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