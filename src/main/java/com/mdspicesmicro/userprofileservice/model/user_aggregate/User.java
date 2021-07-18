package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USERS")
@Builder
public class User {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @OneToOne
    private UserDetails details;

    @ElementCollection
    private List<Device> userDevices;
    
    /*
    @OneToOne
    private UserDevices devices;
    */

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @ElementCollection
    private List<Address> assocAddresses;
    
    @Embedded
    private UserActivityMetrics metrics;

    @Embedded
    private UserContactInfo contactInfo;



}