package com.rainpet.petclinic.controllers;

import java.util.Optional;

import com.rainpet.petclinic.entities.Owner;
import com.rainpet.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.rainpet.petclinic.entities.Pet;
import com.rainpet.petclinic.requests.PetCreateRequest;
import com.rainpet.petclinic.requests.PetUpdateRequest;
import com.rainpet.petclinic.services.PetService;

@Controller
@RequestMapping({"/api/pet", "/"})
public class PetController {
	
	private final PetService petService;
	private final OwnerService ownerService;

	public PetController(PetService petService, OwnerService ownerService) {
		this.petService = petService;
		this.ownerService = ownerService;
	}

	//tum petleri listeleyen controller
	@GetMapping
	public String getAllPets(@RequestParam Optional<Long> ownerId, Model model){
		model.addAttribute("petList",petService.getAllPetsWithParam(ownerId));
		return "HomePage";
		
	}

	//ilgili pet in id sine göre detalarını getriiyrouz
	@GetMapping("/detailPetView/{petId}")
	public String DetailPageView(@PathVariable Long petId,Model model) {
		Pet pet = petService.getOnePetById(petId);
		PetUpdateRequest request =new PetUpdateRequest(pet);
		model.addAttribute("petUpdateRequest",request);
		model.addAttribute("onePetDetail",pet);
		return "DetailPage";
	}

	//update işlememimizde ilgili pet in id sine göre güncelliyoruz
	@PostMapping("/updateOnePet/{petId}")
	public String updateOnePet(@PathVariable Long petId,@ModelAttribute("petUpdateRequest") @RequestBody PetUpdateRequest request ) {
		petService.updateOnePetById(petId, request);
		return "redirect:/api/pet";
	}


	//pet i oluşturan ownerın id sini karşılıyoruz burdaa
	@GetMapping("/createOnePetByOwnerId/{ownerId}")
	public String createOnePetByOwnerId(@PathVariable Long ownerId,Model model){
		PetCreateRequest request = new PetCreateRequest();
		model.addAttribute("pet",request);
		model.addAttribute("ownerId",ownerId);
		return "NewOnePetPage";

	}

	//yeni bir pet oluştururken kullanıyoruz oluşturduktan sonr ahome sayfasına yönlendiriyor
	@PostMapping("/createOnePet/{ownerId}")
	public String createOnePetByOwnerId(@PathVariable Long ownerId, @ModelAttribute("pet") PetCreateRequest request, Model model) {
		request.setOwnerId(ownerId);
		model.addAttribute("newOnePetByOwnerId", petService.createOnePet(request));
		return "redirect:/api/pet";
	}

	//@GetMapping("/{petId}")
	//public Pet getOnePet(@PathVariable Long petId) {
	//	return petService.getOnePetById(petId);
	//}
	

	//Detaylar sayfasındaki delete butonu tetikliyor
	@GetMapping("/deleteOnePet/{petId}")
	public String deleteOnePet(@PathVariable Long petId) {
		petService.deleteOnePetById(petId);
		return "redirect:/api/pet";
	}

}
