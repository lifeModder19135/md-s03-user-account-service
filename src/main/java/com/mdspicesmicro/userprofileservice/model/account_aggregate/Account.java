package com.mdspicesmicro.userprofileservice.model.account_aggregate;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import com.mdspicesmicro.userprofileservice.model.user_aggregate.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name="USER_ACCOUNTS")

public class Account {

	

	@Id
	@GeneratedValue( )
	@Column(value="account_id")
    private Long accountId;
    
	@Setter
	@Column(value="user_id")
	@ManyToOne
    private Long userId;
    
	@Setter
	@Column(value="credentials")
	@OneToOne
	@PrimaryKeyJoinColumn(name="accountId")
    private Credentials credentials;
    
	@Setter
	@Column(value="user_profile")
	@OneToOne
	@PrimaryKeyJoinColumn(name="accountId")
    private UserProfileInfo userProfileInfo;
    
	@Setter
	@Column(value="account_credit")
	@OneToOne
	@PrimaryKeyJoinColumn(name="accountId")
	@Autowired
    private Credit acctCredit;
    
	@Column(value="account_state")
	@OneToOne
	@PrimaryKeyJoinColumn(name="accountId")
	@Autowired
    private AccountState acctState;
    
    // Currently has no purpose, but that will change with time
    
    //private AccountMetrics metrics;
    
    @Builder
    public Account(Long userId, Credentials cred, UserProfileInfo info){
    	this.userId = userId;
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
