package com.datajpa.application.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.application.onetomany.models.Phones;

public interface PhonesRepository extends JpaRepository<Phones, Integer> {

}
