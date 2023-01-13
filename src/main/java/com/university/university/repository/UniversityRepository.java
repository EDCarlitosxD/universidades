package com.university.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.university.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University,Long>{
    
}
