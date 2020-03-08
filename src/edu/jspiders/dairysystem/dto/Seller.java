package edu.jspiders.dairysystem.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller_table")
public class Seller implements Serializable

{
	@Id
	@Column(name="seller_id")
	private int id;
	@Column(name="seller_name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="address")
	private String address;
	@Column(name="phone_number")
	private String phNo;
	@Column(name="sell_date")
	private String date;

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

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", phNo=" + phNo
				+ ", date=" + date + "]";
	}

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

}
