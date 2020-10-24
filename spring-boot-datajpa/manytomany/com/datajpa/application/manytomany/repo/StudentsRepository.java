package com.datajpa.application.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.application.manytomany.models.Students;

public interface StudentsRepository extends JpaRepository<Students,Integer> {

}
