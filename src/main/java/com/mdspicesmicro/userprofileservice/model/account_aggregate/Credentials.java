package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import javax.persistence.MapsId;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;




@Data
@Table("CREDENTIALS")
class Credentials {

   
    Credentials() {
    }
    @Id
    @Column(value="account_id")
    private Long userId;
    

    @Column(value="account_id")
    private String username;

    
    @Column(value="account_id")
    private Password password;


    @Column(value="account_id")
    private Password bcrypt;

}