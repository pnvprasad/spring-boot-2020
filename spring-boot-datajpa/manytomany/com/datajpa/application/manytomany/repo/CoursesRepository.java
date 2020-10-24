package com.datajpa.application.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.application.manytomany.models.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Integer> {

}
