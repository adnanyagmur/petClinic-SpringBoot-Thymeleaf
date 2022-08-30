package com.rainpet.petclinic.services;

import com.rainpet.petclinic.entities.Owner;
import com.rainpet.petclinic.repos.OwnerRepository;
import com.rainpet.petclinic.requests.OwnerCreateRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class OwnerServiceTest {

    //HATAMI ÇÖZEMEDİM İLK TEST DENEYİMİMDİ
   // @InjectMocks
 //   private OwnerService ownerService;

  //  @Mock
  //  private OwnerRepository ownerRepository;



 /*   @Test
    public void createOneOwnerTest(){
        OwnerCreateRequest newOwnerRequest = new OwnerCreateRequest();
        newOwnerRequest.setId(1L);
        newOwnerRequest.setAddress("Address");
        newOwnerRequest.setMail("adnan@gmail.com");
        newOwnerRequest.setName("ADNAN");
        newOwnerRequest.setPhoneNumber("0500");
        newOwnerRequest.setSurname("YAGMUR");
        Owner ownerMock = Mockito.mock(Owner.class);

        Mockito.when(ownerMock.getId()).thenReturn(1L);
        Mockito.when(ownerRepository.save(ArgumentMatchers.any(Owner.class))).thenReturn(ownerMock);
        Owner result= ownerService.createOneOwner(newOwnerRequest);


        Assertions.assertEquals(result.getName(),newOwnerRequest.getName());
        Assertions.assertEquals(result.getId(),1L);
    }*/




    ////////////////////////////////////////////

   // private OwnerService ownerService;

    //private OwnerRepository ownerRepository;
   // private Owner owner;

   // @Before
   // public void setUp() throws Exception {

        //Mock yaratıyoruz
  //      ownerRepository = Mockito.mock(OwnerRepository.class);

        //Boylelikle biz ownerServisimizdeki parametrelere ulaşabilihyoruz.
  //      ownerService= new OwnerService(ownerRepository);
  //  }

  //  @Test
  //  public void whenCreateOneOwnerCalledWithValidRequest_itShouldReturnValidOwnerCreateRequest(){
   //     OwnerCreateRequest newOwnerRequest = new OwnerCreateRequest();
    //    newOwnerRequest.setId(Long.valueOf("123"));
      //  newOwnerRequest.setAddress("Address");
     ///   newOwnerRequest.setMail("adnan@gmail.com");
      //  newOwnerRequest.setName("ADNAN");
     //   newOwnerRequest.setPhoneNumber("0500");
     //   newOwnerRequest.setSurname("YAGMUR");


     //   Owner owner = Owner.builder()
       //         .id(newOwnerRequest.getId())
        //        .address(newOwnerRequest.getAddress())
      //          .mail(newOwnerRequest.getMail())
       //         .name(newOwnerRequest.getName())
       //         .phoneNumber(newOwnerRequest.getPhoneNumber())
      //          .surname(newOwnerRequest.getSurname())
       //                 .build();


       // Mockito.when(ownerService.getOneOwnerById(123L)).thenReturn(owner);



      //  Owner result = ownerService.createOneOwner(newOwnerRequest);

      //  Assert.assertEquals(result,newOwnerRequest);

      //  Mockito.verify(ownerService).getOneOwnerById(123L);


   // }
}