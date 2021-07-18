package com.mdspicesmicro.userprofileservice.model.user_aggregate;

public class UserFactoryImpl implements UserFactory {

	public UserFactoryImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User createUser(UserRole role, String fname, String lname, int age, Gender gender, Email priEmail,
			                                 Email secEmail, PhoneNumber priPhone, PhoneNumber secPhone, String facebookAddr, String twitterId) {
		User.b
		if(role == null ||  {
			this.role = UserRole.REGISTERED;
		} else if(role.compareTo(UserRole.Guest) >= 0) {
			this.role = role
		} else {something}
		return null;
	}

	@Override
	public User createUser(String fname, String lname, int age, Gender gender, Email priEmail, PhoneNumber priPhone) {
		User user = createUser(null, fname, lname, age, gender, priEmail, null, priPhone, null, null, null);
		return user;
	}

}
