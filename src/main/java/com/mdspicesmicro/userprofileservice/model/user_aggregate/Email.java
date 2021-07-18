package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.experimental.Accessors;

@Entity 
class Email {
	
	@Getter
	private final String cleanedEmail;
	
	@Accessors
	private String identifier;
	
	private String domain;
	
	private String suffix;
	
	
	
	
	
	Email(String identifier, String domain, String suffix) {
		super();
		this.identifier = despace(identifier);
		this.domain = despace(domain);
		this.suffix = despace(suffix);
		if (suffix.length() != 3) {
			throw new RuntimeException("Not a valid email -- extension type \"."+suffix+"\" not accepted!");
		}else {
			this.cleanedEmail = identifier + "@" + domain +"." + suffix;
		}
	}
	
	Email(String rawEmail){
		String[] prts = rawEmail.split("\\@|\\.");
		Email(prts[0], prts[1], prts[2]);
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
