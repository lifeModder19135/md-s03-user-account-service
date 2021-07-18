package com.mdspicesmicro.userprofileservice.model.user_aggregate;

public interface UserFactory {
	
	User createUser(UserRole role, String fname, String lname, int age, Gender gender, Email priEmail, Email secEmail, PhoneNumber priPhone, PhoneNumber secPhone, String facebookAddr, String twitterId);
	User createUser(UserRole role, String fname, String lname, int age, Gender gender, Email priEmail, PhoneNumber priPhone);
	

	

}
