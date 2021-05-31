package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.nio.file.Path;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data

public class UserProfileInfo {

    
    public UserProfileInfo() {
    	this.bioText = "";
    	this.profilePicture = null;  //need to add ref to stock photo later
    	
    }
    
    @Id
    @Generated
	@Column(name="account_id")
    private Long accountId;
    
    @Column(name="profile_pic")
    private Path profilePicture;
    
    @Column(name="bio_content")
    private String bioText;


}