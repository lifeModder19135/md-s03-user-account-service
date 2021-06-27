package com.mdspicesmicro.userprofileservice.model.account_aggregate;



import java.nio.file.Path;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

//import com.mdspicesmicro.userprofileservice.model.user_aggregate.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Entity
@Table(name="USER_ACCOUNTS")

public class Account {

	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(value="account_id")
    private Long accountId;
    
	@Setter
	@Column(value="user_id")
	@ManyToOne
    private Long userId;
    
 	@Setter
	@OneToOne
	@JoinColumn(name="accountId")
    private Credentials credentials;
    
	@Setter
	@OneToOne
	@JoinColumn(name="accountId")
    private UserProfileInfo userProfileInfo;
    
	@Setter
	@OneToOne
	@JoinColumn(name="accountId")
	@Autowired
    private Credit acctCredit;
    
	@Setter
	@OneToOne
	@JoinColumn(name="accountId")
	@Autowired
    private AccountState acctState;
	
	@Setter
	@OneToOne
	@JoinColumn(name="accountId")
	private UserAccountPreferences acctPrefs;
    
    
    @Builder
    public Account(Long userId, String uname, String hashedPwd, Path profilePicture, String biotext, UserAccountPreferences acctPrefs){
    	this.userId = userId;
    	this.credentials = Credentials.builder().accountId(this.getAccountId()).username(uname).hashedPassword(hashedPwd).build();
    	this.userProfileInfo = UserProfileInfo.builder().accountId(this.getAccountId()).bioText(biotext).profilePicture(profilePicture).build(); 
    	this.acctPrefs = acctPrefs;
//    	this.acctCredit = new Credit(this.accountId);
//    	this.acctState 
    }
    
    
   

}







/*
package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mdspicesmicro.userprofileservice.model.user_aggregate.User;


@Entity
@Table(name="USER_ACCOUNTS")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;
	
	@Column(name="CREDENTIALS")
	@OneToOne
	private Credentials credentials;
	
	@Column(name="CREDIT")
	@OneToOne
	private Credit credit;
	
	@Column(name="USER_ID")
	@ManyToOne
	private User user;

}

*/
