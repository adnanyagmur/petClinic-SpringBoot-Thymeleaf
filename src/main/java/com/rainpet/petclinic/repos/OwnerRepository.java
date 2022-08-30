package com.rainpet.petclinic.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rainpet.petclinic.entities.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
