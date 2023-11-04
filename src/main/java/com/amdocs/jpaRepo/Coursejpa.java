package com.amdocs.jpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.Entities.Course;

public interface Coursejpa extends JpaRepository<Course,Long> {

}
