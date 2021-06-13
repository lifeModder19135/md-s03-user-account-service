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
	@Mock UserAccountPreferences prefsMock;
	
	@BeforeEach
	void setParams(){
		
		//when(testAccount.getCredentials()).thenReturn(credMock);
		//when(testAccount.getUserId()).thenReturn(userIdMock);
		//when(testAccount.getUserProfileInfo()).thenReturn(infoMock);
		
	}
	
	
		
	
	@Test
	void testFourArgConstructerReturnsProperObject() {
		
		testAccount = new Account(userIdMock, credMock, infoMock, prefsMock);
		
		assertNotNull(testAccount.getAccountId());
		assertNotNull(testAccount.getUserId());
		assertNotNull(testAccount.getAcctCredit());
		assertNotNull(testAccount.getAcctPrefs());
		assertNotNull(testAccount.getAcctState());
		assertNotNull(testAccount.getCredentials());
		assertNotNull(testAccount.getUserProfileInfo());
		
		assertSame(testAccount.getCredentials(), credMock);
		assertSame(testAccount.getUserId(), userIdMock);
		assertSame(testAccount.getUserProfileInfo(), infoMock);
		
	}
	
	void ensureBuilderBehavesAsExplicitCall() {
		
		testAccount = Account.builder().cred(credMock).userId(userIdMock).info(infoMock).build();
		
		assertSame(testAccount.getCredentials(), credMock);
		assertSame(testAccount.getUserId(), userIdMock);
		assertSame(testAccount.getUserProfileInfo(), infoMock);
		
		
	}

}
