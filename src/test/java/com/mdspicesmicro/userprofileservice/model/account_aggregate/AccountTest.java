package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import lombok.Builder;

@ExtendWith(MockitoExtension.class)
class AccountTest {
	
	Account testAccount;
	
	@Mock Long userIdMock;
	@Mock Credentials credMock;
	@Mock UserProfileInfo infoMock;
	
	@BeforeEach
	void setParams(){
		
		when(testAccount.getCred()).thenreturn("$0.00");
		when(testAccount.getUserId()).thenreturn(42);
		when(testAccount.getInfo()).thenreturn("user data");
		
	}
	
	
		
	
	@Test
	void testThreeArgConstructerReturnsProperObject() {
		
		testAccount = Account.builder().cred(credMock).userId(userIdMock).info(infoMock).build();
		
		assertSame(testAccount.getCred(), "$0.00");
		assertSame()testAccount.get(), 42);
		assertSame(testAccount.get(), "user data");
		
	}
	
	void ensureBuilderBehavesAsExplicitCall()

}
