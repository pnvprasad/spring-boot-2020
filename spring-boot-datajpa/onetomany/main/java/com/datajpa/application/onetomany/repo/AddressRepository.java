package com.datajpa.application.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.application.onetomany.models.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
