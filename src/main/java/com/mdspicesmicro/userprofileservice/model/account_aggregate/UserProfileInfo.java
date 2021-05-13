package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.nio.file.Path;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;


public class UserProfileInfo {

    
    public UserProfileInfo() {
    }
    
    @Id
	@Column(name="Account")
    private Long accountId;

    private Path ProfilePicture;

  
    private String bioText;


}