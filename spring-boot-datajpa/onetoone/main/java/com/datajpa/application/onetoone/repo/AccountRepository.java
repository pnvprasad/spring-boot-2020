package com.datajpa.application.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.application.onetoone.models.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
