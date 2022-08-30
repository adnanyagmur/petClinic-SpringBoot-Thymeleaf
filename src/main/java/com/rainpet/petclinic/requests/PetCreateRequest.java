package com.rainpet.petclinic.requests;

import lombok.Data;

@Data
public class PetCreateRequest {

	
	
	Long id;
	String name;
	Integer age;
	String breed;
	String species;
	String description;
	Long ownerId;

	
	public PetCreateRequest() {
	}

	public PetCreateRequest(Long id, String name, Integer age, String breed, String species, String description,
			Long ownerId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.species = species;
		this.description = description;
		this.ownerId = ownerId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	
	
	
	
}
