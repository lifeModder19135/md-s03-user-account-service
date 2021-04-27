package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "DEVICE")
public class Address {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDRESS_ID")
    public Long AddressId;

	@Column(name = "ADDRESSEE")
	@NotBlank(message="Unique user ID is required.")
	private String addressee;

	@Column(name = "STREET_LINE_1")
	@NotBlank(message="Street Address is required.")
    private String line1;

	@Column(name = "STREET_LINE_2")
    public String line2;

	@Column(name = "CITY")
	@NotBlank(message="City is required.")
    private String city;

	@Column(name = "STATE")
	@NotBlank(message="State is required.")
    private String state;
    
	@Column(name = "ZIP")
	@NotBlank(message="ZIP code is required.")
    private String zipCode;
    
    
    //Use if 'line2' field is empty, all spaces, or null
    public Address(String addressee, String line1, String city, String state, String zipCode) {    	
    	super();
    	this.addressee = addressee;
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		
		/*
    	super();
		setAddressee(addressee);
		setLine1(line1);
		setCity(city);
		setState(state);
		setZipCode(zipCode);
    	*/
		
    }

    
    
    //Use if 'line2' field contains non-space characters 
    public Address(String addressee, String line1, String line2, String city, String state, String zipCode) {
    	super();
    	this.addressee = addressee;
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		
    	/*
    	super();
		setAddressee(addressee);
		setLine1(line1);
		setLine2(line2);
		setCity(city);
		setState(state);
		setZipCode(zipCode);
		*/
	}



	public String getAddressee() {
		return addressee;
	}


	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}


	public String getLine1() {
		return line1;
	}


	public void setLine1(String line1) {
		this.line1 = line1;
	}


	public String getLine2() {
		return line2;
	}


	public void setLine2(String line2) {
		this.line2 = line2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}    
    
}