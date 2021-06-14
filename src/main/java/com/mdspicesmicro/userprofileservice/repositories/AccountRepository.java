package com.mdspicesmicro.userprofileservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;

interface AccountRepository extends JpaRepository<Account, Long> {

	

}
