package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import lombok.Builder;

@ExtendWith(MockitoExtension.class)
class AccountTest {
	
	
	
		
	
	@Test
	void testThreeArgConstructerReturnsProperObject() {
		
		Account testAccount = Account.builder().build();
		
		
	}

}
