package com.enterprise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.entities.JobPosition;

public interface JobPositionRepository extends JpaRepository<JobPosition, Long>{

}