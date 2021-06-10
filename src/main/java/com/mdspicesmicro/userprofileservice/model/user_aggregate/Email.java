package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.experimental.Accessors;

@Entity 
class Email {
	
	@Getter
	private final String cleanedEmail;
	
	@Accessors
	private String userId;
	
	private String domain;
	
	private String suffix;
	
	
	
	
	
	public Email(String userId, String domain, String suffix) {
		super();
		this.userId = despace(userId);
		this.domain = despace(domain);
		this.suffix = despace(suffix);
		if (suffix.length() == 3) {
			throw new RuntimeException("Not a valid email -- Invalid extension!");
		}else {
			this.cleanedEmail = userId + "@" + domain +"." + suffix;

		}
	}





	private String despace(String str) {
		
		char[] arr =  str.toCharArray();
		String res = "";
		for (char c : arr) {
			if(Character.isWhitespace(c)) {
				continue;
			}else {
				res += c;
			}		
		};
		return res;
		
	}
	
	

}
