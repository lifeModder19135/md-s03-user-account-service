package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.nio.file.Path;

import javax.persistence.Column;
import javax.persistence.Id;
//import javax.persistence.Table;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Table("PROFILE_INFO")
public class UserProfileInfo {

    
    public UserProfileInfo() {
    	this.bioText = "";
    	this.profilePicture = null;  //need to add ref to stock photo later
    	
    }
    
    @Id
	@Column(name="account_id")
    private Long accountId;
    
    @Accessors
    @Column(name="profile_pic")
    private Path profilePicture;
    
    
    @Column(name="bio_content")
    private String bioText;


}