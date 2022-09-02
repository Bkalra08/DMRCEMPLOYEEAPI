package com.EmployeeDMRC.EmpDMRC.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeDMRC.EmpDMRC.DAO.DaoLayer;
import com.EmployeeDMRC.EmpDMRC.Entity.EmpDetails;

@Service
public class servicesImpl implements service {
	@Autowired
	private DaoLayer daolayer;

	@Override
	public EmpDetails addEmpData(EmpDetails details) {
		daolayer.save(details);
		return details;
	}

	@Override
	public EmpDetails getDetails(int EmpID) {
		return daolayer.findById(EmpID);
	}

	@Override
	public EmpDetails findById(int EmpID) {
		return daolayer.findById(EmpID);
	}

	@Override
	public void DeleteData(int EmpID) {
		daolayer.deleteById(EmpID);
	}
	
	

}
