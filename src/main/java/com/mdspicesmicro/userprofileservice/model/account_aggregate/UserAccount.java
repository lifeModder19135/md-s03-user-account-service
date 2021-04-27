
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import com.mdspicesmicro.userprofileservice.model.user_aggregate.User;

import lombok.AllArgsConstructor;

@Entity
public class UserAccount {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    
    private User user;

    private Credentials credentials;

    private UserProfileInfo userProfileInfo;

    private Credit acctCredit;

    private AccountState state;

    private AccountMetrics metrics;
    
    
    public UserAccount(){
    	user = new User(null, null, null, null); //todo -- add proper params
    	metrics = new AccountMetrics(accountId)
    	
    }

}