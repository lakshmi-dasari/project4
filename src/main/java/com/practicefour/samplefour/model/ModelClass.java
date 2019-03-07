package com.practicefour.samplefour.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="samplefour")
public class ModelClass {

	private long id;
	private String firstname;
	private String lastname;
	private String address;
	
	@Id @Column(name="id", nullable=false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="firstname", nullable=false)
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Column(name="lastname",nullable=false)
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Column(name="address",nullable=false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ModelClass(int id, String firstname, String lastname, String address) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	public ModelClass() {
		
	}
	@Override
	public String toString() {
		return "ModelClass [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ "]";
	}
	
	
	
	
}
