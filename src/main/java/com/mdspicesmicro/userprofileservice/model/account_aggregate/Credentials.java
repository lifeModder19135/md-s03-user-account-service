package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table("CREDENTIALS")

class Credentials {

   
    
    @Id
    @Column(value="account_id")
    private  Long accountId;
    

    @Column(value="username")
    private String username;

    
    @Column(value="safe_pwd")
    private String hashedPassword;


}