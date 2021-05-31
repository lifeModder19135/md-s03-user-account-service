package com.mdspicesmicro.userprofileservice.model.account_aggregate;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import com.mdspicesmicro.userprofileservice.model.user_aggregate.User;

import lombok.AllArgsConstructor;

@Entity
@Table(name="USER_ACCOUNTS")
public class Account {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    
	@Column(value="user_id")
	@ManyToOne
    private User user;
    
	@Column(value="credentials")
	@OneToOne
    private Credentials credentials;
    
	@OneToOne
	@JoinColumn(name="profile_info")
    private UserProfileInfo userProfileInfo;
    
	@OneToOne
	@JoinColumn(name="credit")
    private Credit acctCredit;
    
    
    private AccountState state;
    
    
    private AccountMetrics metrics;
    
    
    public Account(Credentials cred, UserProfileInfo info ){
    	
    	this.credentials = cred;
    	this.userProfileInfo = info;
    	
    	
    	
    }

}


//  Below is the old version of the class def. Had 2 versions of this class under different
//  names. Above is the version I chose to keep. Below is the extra, just in case...

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
