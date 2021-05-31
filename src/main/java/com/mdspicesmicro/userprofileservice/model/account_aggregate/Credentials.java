package com.mdspicesmicro.userprofileservice.model.account_aggregate;




class Credentials {

   
    Credentials() {
    }
    @Id
    @MapsId()
    private Long userId;

    
    private String username;

    
    private Password password;



    
    private Password bcrypt;

}