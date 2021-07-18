package com.mdspicesmicro.userprofileservice.model.user_aggregate;

public class UserFactoryImpl implements UserFactory {

	public UserFactoryImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User createUser(UserRole role, String fname, String lname, int age, Gender gender, Email priEmail,
			                                 Email secEmail, PhoneNumber priPhone, PhoneNumber secPhone, String facebookAddr, String twitterId) {
		if(role == null) {
			
		}
		return null;
	}

	@Override
	public User createUser(UserRole role, String fname, String lname, int age, Gender gender, Email priEmail,
			PhoneNumber priPhone) {
		// TODO Auto-generated method stub
		return null;
	}

}
