package com.prabhanjan.emp.mgmt.app;

public class EmployeeBean {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private Address address;

	public EmployeeBean(int id, String name, double salary, String designation, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.setAddress(address);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getdesignation() {
		return designation;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", address=" + address + "]";
	}

	public Address getAddress() {
		Address address = new Address();
		address.setAddressLine1(address.getAddressLine1());
		address.setAddressLine2(address.getAddressLine2());
		address.setCity(address.getCity());
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
