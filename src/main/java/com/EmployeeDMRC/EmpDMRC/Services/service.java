package com.EmployeeDMRC.EmpDMRC.Services;

import com.EmployeeDMRC.EmpDMRC.Entity.EmpDetails;


public interface service {

	EmpDetails addEmpData(EmpDetails details);

	EmpDetails getDetails(int EmpID);

	EmpDetails findById(int EmpID);
	
	void DeleteData(int EmpID);
}
