package com.mdspicesmicro.userprofileservice.model.user_aggregate;


import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
@Builder
class UserContactInfo {


    
    private Long userId;

    
    private Email primaryEmail;

    
    private Email secondaryEmail;

    
    private PhoneNumber primaryPhone;

    
    private PhoneNumber secondaryPhone;

    
    private String facebookAddress;

    
    private String twitterId;


}