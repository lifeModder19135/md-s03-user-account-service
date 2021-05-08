package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
class UserDetails {

    
    UserDetails() {
    }

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(name="FIRST_NAME")
    private String fName;

    @Column(name="LAST_NAME")
    private String lName;

    @Column(name="AGE")
    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;


}