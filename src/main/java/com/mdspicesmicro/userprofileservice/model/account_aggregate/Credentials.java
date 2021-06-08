package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@Data
@Table("CREDENTIALS")
class Credentials {

   
    Credentials() {
    }
    @Id
    @Column(value="user_id")
    private Long userId;
    

    @Column(value="username")
    private String username;

    
    @Column(value="safe_pwd")
    private String hashedPassword;


//    @Column(value="account_id")
//    private Password bcrypt;

}