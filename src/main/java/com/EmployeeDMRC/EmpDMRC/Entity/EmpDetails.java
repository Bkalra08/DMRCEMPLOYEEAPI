package com.EmployeeDMRC.EmpDMRC.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;




@Document(collection = "EmpDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class EmpDetails {

	@Id
	private int EmpID;
	private String Fullname;
	private String Position;
	private String JoinDate;
	private int Salary;
}
