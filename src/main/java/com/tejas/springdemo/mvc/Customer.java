package com.tejas.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tejas.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1 ,message = "is required")
	private String lastName;
	
	
	@Min(value=0, message="Must be Greater than or equal to zero")
	@Max(value=10, message = "Must be less than or equal to ten")
	private int freePasses;
	
	@CourseCode
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	
	
}
