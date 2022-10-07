package com.policyapp.service.dao;

import java.util.List;

import com.policyapp.model.Policy;
import com.policyapp.service.exception.IdNotFoundException;
import com.policyapp.service.exception.PolicyNotFoundException;

public interface IPolicyDAO {
	 List<Policy> findAll();
	 List<Policy> findByType(String policy) throws PolicyNotFoundException ;
	 List<Policy> findByCategory(String category) throws PolicyNotFoundException;
	 List<Policy> findByHighSumAssured(double sumAssured) throws PolicyNotFoundException;
	 List<Policy> findByCoverage(String coverage) throws PolicyNotFoundException;
	 List<Policy> findByLessPremium(double premium) throws PolicyNotFoundException;
	 
	 Policy findById(int policyId) throws IdNotFoundException;
}
