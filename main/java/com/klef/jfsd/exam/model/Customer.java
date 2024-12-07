package com.klef.jfsd.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long cId;

   private String name;
   private String email;
   private String ph;
   private String address;
   private String dob;
public Long getcId() {
	return cId;
}
public void setcId(Long cId) {
	this.cId = cId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPh() {
	return ph;
}
public void setPh(String ph) {
	this.ph = ph;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}

 
	
}
