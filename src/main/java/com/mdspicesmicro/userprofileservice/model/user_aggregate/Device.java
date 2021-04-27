package com.mdspicesmicro.userprofileservice.model.user_aggregate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.mdspicesmicro.userprofileservice.exceptions.IllegalConstructorException;


@Entity
@Table(name = "DEVICE")
class Device  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DEVICE_ID")
    private Long deviceId;
    
    @Column(name="NAME")
	private String name;
    
    @Column(name = "DEVICE_TYPE")
    private DeviceType type;
    
    @Column(name = "SCREEN_WIDTH")
    private int screenWidth;

    @Column(name = "SCREEN_HEIGHT")
    private int screenHeight;

	
	Device() throws IllegalConstructorException {
    	throw new IllegalConstructorException(
    			"Device object cannot be created via no-args constructor"
    			);
    }

   
    public Device(String name, DeviceType type, int screenWidth, int screenHeight) {
		super();
		this.name = name;
		this.type = type;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
	}


	

}