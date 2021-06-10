package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.nio.file.Path;

import org.springframework.data.relational.core.mapping.Column;
import javax.persistence.MapsId;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("PROFILE_INFO")
public class UserProfileInfo {

    
    public UserProfileInfo() {
    	this.bioText = "";
    	this.profilePicture = null;  //need to add a ref to stock photo later
    	
    }
    
    @Id
	@Column(value="account_id")
    private Long accountId;
    
    @Column(value="profile_pic")
    private Path profilePicture;
    
    @Column(value="bio_content")
    private String bioText;


}