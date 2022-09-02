package com.EmployeeDMRC.EmpDMRC.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.EmployeeDMRC.EmpDMRC.Entity.EmpDetails;

public interface DaoLayer extends MongoRepository<EmpDetails, Integer> {

	EmpDetails findById(int empID);

}
