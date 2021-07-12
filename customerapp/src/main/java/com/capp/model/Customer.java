package com.capp.model;

public class Customer {
	private String customerName;
	private String customerPassword;
	private String customerGender;
	private String customerQualification;
	private String customerAddress;
	private String customerState;
	public Customer() {
		super();
	}
	public Customer(String customerName, String customerPassword, String customerGender, String customerQualification,
			String customerAddress, String customerState) {
		super();
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerGender = customerGender;
		this.customerQualification = customerQualification;
		this.customerAddress = customerAddress;
		this.customerState = customerState;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerQualification() {
		return customerQualification;
	}
	public void setCustomerQualification(String customerQualification) {
		this.customerQualification = customerQualification;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerState() {
		return customerState;
	}
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}
	
	
}
