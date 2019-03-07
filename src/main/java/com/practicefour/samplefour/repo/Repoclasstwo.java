package com.practicefour.samplefour.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.practicefour.samplefour.model.ModelClass;

@Repository
public class Repoclasstwo {

	@PersistenceContext
	private EntityManager entitymanager;
	
	public List<ModelClass> getaddressbylastname(String address){
		Query q=entitymanager.createNativeQuery("select address from public.samplefour where lastname like :lastname");
		q.setParameter("lastname",address);
		List<ModelClass> model=q.getResultList();
		return model;
		
	}
	
}
