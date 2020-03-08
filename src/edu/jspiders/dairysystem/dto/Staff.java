package edu.jspiders.dairysystem.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="staff_table")
public class Staff implements Serializable{

	@Id
	@Column(name="staff_id")
	private int id;
	@Column(name="staff_name")
	private String name;	
	@Column(name="gender")
	private String gender;
	@Column(name="address")
	private String address;
	@Column(name="designation")
	private String desg;
	@Column(name="salary")
	private double salary;
	@Column(name="phone_number")
	private String phNo;
	@Column(name="date_of_join")
	private String doj;
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", desg=" + desg
				+ ", salary=" + salary + ", phNo=" + phNo + ", doj=" + doj + "]";
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}


}
