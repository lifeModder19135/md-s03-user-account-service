package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;




@Data
@Table("CREDENTIALS")
class Credentials {

   
    Credentials() {
    }
    @Id
    @MapsId()
    @Column(value="account_id")
    private Long userId;
    

    @Column(value="account_id")
    private String username;

    
    @Column(value="account_id")
    private Password password;


    @Column(value="account_id")
    private Password bcrypt;

}