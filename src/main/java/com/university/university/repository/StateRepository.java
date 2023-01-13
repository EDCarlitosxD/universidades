package com.university.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.university.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State,Long> {
    
}
