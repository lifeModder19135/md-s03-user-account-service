package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import java.util.regex.Pattern;
import java.io.IOException;
import java.util.regex.Matcher;

public class PhoneNumber {
	
	private String areaCode;
	private String prefix;
	private String suffix;
	
	PhoneNumber(String areaCode, String first3, String last4) throws IOException {
		if (isThreeDigits(areaCode) 
				&& isThreeDigits(first3) 
				&& isThreeDigits(last4)) {
			this.areaCode=areaCode;
			this.prefix=first3;
			this.suffix= last4;
		} else {
			throw new IOException(
					"Invalid entry; Must enter a valid phone number.");
		}
	}
	
	
	public Boolean isThreeDigits(String target) {
		
		Pattern pattern = Pattern.compile("^\\d{3}$");
		Matcher matcher = pattern.matcher(target); 		
		return matcher.find();
		
	}
	
	public Boolean isFourDigits(String target) {
		
		Pattern pattern = Pattern.compile("^\\d{4}$");
		Matcher matcher = pattern.matcher(target); 		
		return matcher.find();
		
	}	
	
	@Override
	public String toString() {
		 
		return "("+areaCode+") "+prefix+"-"+suffix;
	}
	

}
