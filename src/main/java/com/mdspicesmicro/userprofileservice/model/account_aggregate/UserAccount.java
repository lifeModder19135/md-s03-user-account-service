/*
 * ************************DO NOT USE!***************************************
 *
 * package com.mdspicesmicro.userprofileservice.model.account_aggregate;
 * 
 * 
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.ManyToOne;
 * import javax.persistence.OneToOne; import javax.persistence.Table;
 * 
 * import org.springframework.data.annotation.Id;
 * 
 * import com.mdspicesmicro.userprofileservice.model.user_aggregate.User;
 * 
 * import lombok.AllArgsConstructor;
 * 
 * @Entity
 * 
 * @Table(name="USER_ACCOUNTS") public class UserAccount {
 * 
 * 
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private Long accountId;
 * 
 * @Column(name="USER_ID")
 * 
 * @ManyToOne private User user;
 * 
 * @Column(name="CREDENTIALS")
 * 
 * @OneToOne private Credentials credentials;
 * 
 * @OneToOne
 * 
 * @JoinColumn(name="CREDIT") private UserProfileInfo userProfileInfo;
 * 
 * 
 * private Credit acctCredit;
 * 
 * 
 * private AccountState state;
 * 
 * 
 * private AccountMetrics metrics;
 * 
 * 
 * public UserAccount(){ //user = new User(null, null, null, null); //todo --
 * add proper params //metrics = new AccountMetrics(accountId)
 * 
 * }
 * 
 * }
 */