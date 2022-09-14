package com.lms.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.application.model.LmsBatchModel;

@Repository
public interface LmsBatchRepository extends JpaRepository<LmsBatchModel,Integer> {

}
