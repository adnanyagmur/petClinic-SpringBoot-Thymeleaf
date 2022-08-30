package com.rainpet.petclinic.requests;

import com.rainpet.petclinic.entities.Owner;
import lombok.Data;

@Data
public class OwnerUpdateRequest {

	String name;
	String surname;
	String address;
	String phoneNumber;
	String mail;
	public OwnerUpdateRequest() {
	}
	public OwnerUpdateRequest(Owner owner) {
		this.name = owner.getName();
		this.surname = owner.getSurname();
		this.address = owner.getAddress();
		this.phoneNumber = owner.getPhoneNumber();
		this.mail = owner.getMail();
	}
	public OwnerUpdateRequest(String name, String surname, String address, String phoneNumber, String mail) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
