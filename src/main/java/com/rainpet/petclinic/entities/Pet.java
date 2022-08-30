package com.rainpet.petclinic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="PET")
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private Integer age;
	
	
	//Tür bilgisi 
	@Column(name="BREED")
	private String breed;
	
	//Cins bilgisi
	@Column(name="SPECIES")
	private String species;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	//bir owner ın bir sürü pet i olabilir bunun için bu ilişki kuruldu
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="OWNER_ID",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@JsonIgnore
	private Owner owner;
	
	

	
	

	public Pet() {
	}


	public Pet(Long id, String name, Integer age, String breed, String species, String description, Owner owner) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.species = species;
		this.description = description;
		this.owner = owner;
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

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
