package com.EmployeeDMRC.EmpDMRC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;



@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "EmpDMRC",version = "1.0" , description= "API for Employee System for DMRC"))


public class EmpDmrcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDmrcApplication.class, args);
	}

}
