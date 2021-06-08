package com.mdspicesmicro.userprofileservice.model.account_aggregate;



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
import lombok.Setter;

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
    
// 	@Setter
	@OneToOne
	@JoinColumn(name="accountId")
    private Credentials credentials;
    
//	@Setter
	@OneToOne
	@JoinColumn(name="accountId")
    private UserProfileInfo userProfileInfo;
    
//	@Setter
	@OneToOne
	@JoinColumn(name="accountId")
	@Autowired
    private Credit acctCredit;
    
	@OneToOne
	@JoinColumn(name="accountId")
	@Autowired
    private AccountState acctState;
	
	@OneToOne
	@JoinColumn(name="accountId")
	private UserAccountPreferences acctPrefs;
    
    
    @Builder
    public Account(Long userId, Credentials cred, UserProfileInfo info, UserAccountPreferences acctPrefs){
    	this.userId = userId;
    	this.credentials = cred;
    	this.userProfileInfo = info; 
    	this.acctPrefs = acctPrefs;
    	
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
