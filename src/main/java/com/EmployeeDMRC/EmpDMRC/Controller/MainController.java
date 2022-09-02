package com.EmployeeDMRC.EmpDMRC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeDMRC.EmpDMRC.DAO.DaoLayer;
import com.EmployeeDMRC.EmpDMRC.Entity.EmpDetails;
import com.EmployeeDMRC.EmpDMRC.Services.service;

@RestController
@RequestMapping("/EmpData")
public class MainController {
	@Autowired
	private service services;
	@Autowired
	private DaoLayer dlayer;
	
	
	@PostMapping("/addEmpData")
	public EmpDetails addEmpData(@RequestBody EmpDetails details) {
		return this.services.addEmpData(details);
	}
	
	@GetMapping("/getEmpData/{EmpID}")
	public EmpDetails getDetails(@PathVariable String EmpID) {
		
		return this.services.getDetails(Integer.parseInt(EmpID));
		
	}
	@DeleteMapping("/DLTDATA/{EmpID}")
	public ResponseEntity<?>DeleteData(@PathVariable int EmpID){
		services.DeleteData(services.findById(EmpID).getEmpID());
		 return new ResponseEntity("Data deleted successfully", HttpStatus.OK);
	}
	
	

}
