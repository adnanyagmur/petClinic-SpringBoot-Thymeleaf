package com.rainpet.petclinic.requests;

import com.rainpet.petclinic.entities.Pet;
import lombok.Data;

@Data
public class PetUpdateRequest {
	
	String name;
	Integer age;
	String breed;
	String species;
	String description;


	
	public PetUpdateRequest() {
	}

	public PetUpdateRequest(Pet pet) {

		this.name = pet.getName();
		this.age = pet.getAge();
		this.breed = pet.getBreed();
		this.species = pet.getSpecies();
		this.description = pet.getDescription();
	}

	public PetUpdateRequest(String name, Integer age, String breed, String species, String description) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.species = species;
		this.description = description;
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
	
	

	
}
