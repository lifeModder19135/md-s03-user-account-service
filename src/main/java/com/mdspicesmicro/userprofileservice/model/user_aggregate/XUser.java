package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class XUser {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable=false)
    private String username;

    @Column(nullable=false)
    private String password;

    private int active;

    private String roles = "";
    
    private String permissions = "";

    
    public XUser(String uname, String pwd, String roles, String permissions) {
        this.username = uname;
        this.password = pwd;
        this.roles = roles;
        this.permissions = permissions;
        this.active = 1;
    }

}