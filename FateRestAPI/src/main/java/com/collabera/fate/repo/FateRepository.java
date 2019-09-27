package com.collabera.fate.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.fate.model.FateModel;

// This will be AUTO IMPLEMENTED by Spring into a Bean
// CRUD refers Create, Read, Update, Delete
@Repository
public interface FateRepository extends JpaRepository<FateModel, Integer> {

}