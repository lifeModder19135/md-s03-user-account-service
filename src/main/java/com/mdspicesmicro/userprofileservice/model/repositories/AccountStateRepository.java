package com.mdspicesmicro.userprofileservice.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdspicesmicro.userprofileservice.model.account_aggregate.AccountStatus;

public interface AccountStateRepository extends JpaRepository<AccountState, Long> {

}
