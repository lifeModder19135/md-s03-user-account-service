package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.persistence.Column;
import javax.persistence.Id;
//import javax.persistence.Table;

import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table("PROFILE_INFO")
@Builder
public class UserProfileInfo {

    
//    public UserProfileInfo() {
//    	this.bioText = "";
//      this.profilePicture = Paths.get(thisPath, "..//..")
//    	 //need to add a ref to stock photo later
//    	
//    }
    
	private final Path thisPath = Paths.get(".").toAbsolutePath().normalize();
	
    @Id
	@Column(name="account_id")
    private Long accountId;
    
    @Accessors
    @Column(name="profile_pic")
    private Path profilePicture;
    
    @Accessors
    @Column(name="bio_content")
    private String bioText;


}