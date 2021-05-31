package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.nio.file.Path;

import org.springframework.data.relational.core.mapping.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@Table("PROFILE_INFO")
public class UserProfileInfo {

    
    public UserProfileInfo() {
    	this.bioText = "";
    	this.profilePicture = null;  //need to add ref to stock photo later
    	
    }
    
    @Id
	@Column(value="account_id")
    private Long accountId;
    
    @Column(value="profile_pic")
    private Path profilePicture;
    
    @Column(value="bio_content")
    private String bioText;


}