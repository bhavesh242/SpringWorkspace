package com.luv2code.springdemo.com;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	@Min(value=0,message= "must be greater than or equal to zero")
	@Max(value=10,message= "must be less than or equal to 10")
	@NotNull(message="Field is required")
	private Integer freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message="Postal Code Should Only contain 5 digits/characters")
	private String postalCode;
	
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	private String firstName;
	@NotNull(message = "is required" )
	@Size(min=1, message = "is required")
	private String lastName;
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
