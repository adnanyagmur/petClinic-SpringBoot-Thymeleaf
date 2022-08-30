package com.rainpet.petclinic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.rainpet.petclinic.entities.Owner;
import com.rainpet.petclinic.repos.OwnerRepository;
import com.rainpet.petclinic.requests.OwnerCreateRequest;
import com.rainpet.petclinic.requests.OwnerUpdateRequest;

@Service
public class OwnerService {

	private OwnerRepository ownerRepository;

	public OwnerService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	public List<Owner> getAllOwners() {
		return ownerRepository.findAll();

	}

	public Owner getOneOwnerById(Long ownerId) {
		return ownerRepository.findById(ownerId).orElse(null);
	}

	public Owner createOneOwner(OwnerCreateRequest newOwnerRequest) {
			Owner toSave = new Owner();
			toSave.setId(newOwnerRequest.getId());
			toSave.setAddress(newOwnerRequest.getAddress());
			toSave.setMail(newOwnerRequest.getMail());
			toSave.setName(newOwnerRequest.getName());
			toSave.setPhoneNumber(newOwnerRequest.getPhoneNumber());
			toSave.setSurname(newOwnerRequest.getSurname());
			return ownerRepository.save(toSave);
	}

	public Owner updateOneOwnerById(Long ownerId, OwnerUpdateRequest updateOwner) {
		Optional<Owner> owner = ownerRepository.findById(ownerId);
		if(owner.isPresent()) {
			Owner toUpdate = owner.get();
			toUpdate.setAddress(updateOwner.getAddress());
			toUpdate.setMail(updateOwner.getMail());
			toUpdate.setName(updateOwner.getName());
			toUpdate.setPhoneNumber(updateOwner.getPhoneNumber());
			toUpdate.setSurname(updateOwner.getSurname());
			ownerRepository.save(toUpdate);
			return toUpdate;
		}
		return null;
	}

	public void deleteOneOwnerById(Long ownerId) {
		ownerRepository.deleteById(ownerId);
		
	}

	
	
}
