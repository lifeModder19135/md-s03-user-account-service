package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "CREDENTIALS")
class Credentials {


    Credentials(String username, Password hashedPwd) {
    	this.username = username;
    	this.password = hashedPwd;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @@Column(name = "")
    private String username;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @@Column(name = "")
    private Password password;


    private PasswordEncoder bcrypt;

}