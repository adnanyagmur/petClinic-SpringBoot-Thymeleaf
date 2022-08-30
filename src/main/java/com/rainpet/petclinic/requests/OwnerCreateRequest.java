package com.rainpet.petclinic.requests;

import lombok.Data;

@Data
public class OwnerCreateRequest {

	Long id;
	String address;
	String mail;
	String name;
	String phoneNumber;
	String surname;

	public OwnerCreateRequest(Long id, String address, String mail, String name, String phoneNumber,
			String surname) {
		super();
		this.id = id;
		this.address = address;
		this.mail = mail;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.surname = surname;
	}
	public OwnerCreateRequest() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
