package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.Account;

@Repository
public interface AcctRepository extends JpaRepository<Account, Long> {

	

}
