package com.springboot.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeNotFoundException extends RuntimeException{
	
	 private static final long serialVersionUID = 1L;

	 private String errorCode;
	 private String errorMessage;
}
