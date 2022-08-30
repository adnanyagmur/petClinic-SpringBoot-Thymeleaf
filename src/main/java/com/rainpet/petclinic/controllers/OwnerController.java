package com.rainpet.petclinic.controllers;

import com.rainpet.petclinic.entities.Pet;
import com.rainpet.petclinic.services.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.rainpet.petclinic.entities.Owner;
import com.rainpet.petclinic.requests.OwnerCreateRequest;
import com.rainpet.petclinic.requests.OwnerUpdateRequest;
import com.rainpet.petclinic.services.OwnerService;

@Controller
@RequestMapping("/api/owner")
public class OwnerController {

	private OwnerService ownerService;

	private final PetService petService;

	public OwnerController(OwnerService ownerService, PetService petService) {
		this.ownerService = ownerService;
		this.petService = petService;
	}
	

	//owner modelimizi OwnerListPage sayfamızda döndürüyoruz
	@GetMapping
	public String getAllOwners( Model model){
		model.addAttribute("ownerList",ownerService.getAllOwners());
		return "OwnerListPage";
	}

	//OwnerListPage sayfasındaki Detay butonuna basılınca ilgili owner ın id si ile beraber OwnerDetailPage e yönlendiriyrouz
	@GetMapping("/detailOwnerView/{ownerId}")
	public String DetailPageView(@PathVariable Long ownerId,Model model) {
		Owner owner = ownerService.getOneOwnerById(ownerId);
		OwnerUpdateRequest updateOwner = new OwnerUpdateRequest(owner);
		model.addAttribute("ownerUpdateRequest",updateOwner);
		model.addAttribute("oneOwnerDetail",owner);
		return "OwnerDetailPage";
	}
	//OwnerDetailPage sayfasında TextBox larımızda ownerlarımızın bilgisini update etmek istersek update edilecek bilgiyi girdiğimizde
	//update butonununa basınca updateOneOwnerById servisimiz çalışıyor ve OwnerListPage sayfamıza geri yönlendiriyoruz.
	@PostMapping("/updateOneOwner/{ownerId}")
	public String updateOneOwner(@PathVariable Long ownerId,@ModelAttribute("ownerUpdateRequest") @RequestBody OwnerUpdateRequest updateOwner) {
		ownerService.updateOneOwnerById(ownerId,updateOwner);
		return "redirect:/api/owner";
	}

	//@GetMapping("/ownerDetailPetView/{petId}")
	//public String OwnerDetailPageView(@PathVariable Long ownerId,Model model) {
	//	model.addAttribute("oneOwnerDetail",ownerService.getOneOwnerById(ownerId));
	//	return "OwnerDetailPage";
	//}

	// Yeni bir owner kaydedeğimiz zaman navbarda new owner butonuna tıklanınca tetikleniyor
	//Ve dto muzdan bir obje oluşturyor
	@GetMapping("/createOneOwnerView")
	public String createOneOwnerView( Model model) {
		OwnerCreateRequest newOwnerRequest = new OwnerCreateRequest();
		model.addAttribute("newOneOwner",newOwnerRequest);
		return "NewOneOwnerPage";
	}

	// newOneOwnerPage de oluşturuduğumuz owner ı kaydetmek için createOneOwner servisini çalıştırıyor ilgili pete redirect ediyor.
	@PostMapping("/createOneOwner")
	public String createOneOwner(@ModelAttribute("newOneOwner") OwnerCreateRequest newOwnerRequest) {
		ownerService.createOneOwner(newOwnerRequest);
		return "redirect:/api/owner";
	}
	
	//@GetMapping("/{ownerId}")
	//public Owner getOneOwner(@PathVariable Long ownerId) {
	//	return ownerService.getOneOwnerById(ownerId);
	//}
	

	//Detay bilgilerinin olduğu yerde ki delete butonu bu controlleri tetikliyor ve delete işlemini yapıyor.
	@GetMapping("/deleteOneOwner/{ownerId}")
	public String deleteOneOwner(@PathVariable Long ownerId) {
		ownerService.deleteOneOwnerById(ownerId);
		return "redirect:/api/owner";
	}

}
