package com.practicefour.samplefour.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicefour.samplefour.model.ModelClass;

@Repository
public interface RepoClass extends JpaRepository<ModelClass,Long> {

}
