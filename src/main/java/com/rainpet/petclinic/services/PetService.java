package com.rainpet.petclinic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rainpet.petclinic.entities.Owner;
import com.rainpet.petclinic.entities.Pet;
import com.rainpet.petclinic.repos.PetRepository;
import com.rainpet.petclinic.requests.PetCreateRequest;
import com.rainpet.petclinic.requests.PetUpdateRequest;

@Service
public class PetService {

	private PetRepository petRepository;
	private OwnerService ownerService;

	public PetService(PetRepository petRepository, OwnerService ownerService) {
		this.petRepository = petRepository;
		this.ownerService = ownerService;
	}

	public List<Pet> getAllPetsWithParam(Optional<Long> ownerId) {
		if(ownerId.isPresent()) {
			return petRepository.findByOwnerId(ownerId.get());
		}else
		return petRepository.findAll();
	}

	public Pet getOnePetById(Long petId) {
		return petRepository.findById(petId).orElse(null);
	}

	public Pet createOnePet(PetCreateRequest request) {
		Owner owner = ownerService.getOneOwnerById(request.getOwnerId());
		if(owner !=null) {
			Pet petToSave = new Pet();
			petToSave.setId(request.getId());
			petToSave.setOwner(owner);
			petToSave.setName(request.getName());
			petToSave.setAge(request.getAge());
			petToSave.setBreed(request.getBreed());
			petToSave.setDescription(request.getDescription());
			petToSave.setSpecies(request.getSpecies());
			return petRepository.save(petToSave);
		}else
			return null;
	}

	public Pet updateOnePetById(Long petId, PetUpdateRequest request) {
		Optional<Pet> pet = petRepository.findById(petId);
		if(pet.isPresent()) {
			Pet petToUpdate = pet.get();
			petToUpdate.setName(request.getName());
			petToUpdate.setAge(request.getAge());
			petToUpdate.setBreed(request.getBreed());
			petToUpdate.setDescription(request.getDescription());
			petToUpdate.setSpecies(request.getSpecies());
			return petRepository.save(petToUpdate);
		}else
			return null;
	}

	public void deleteOnePetById(Long petId) {
		petRepository.deleteById(petId);
		
	}

}
