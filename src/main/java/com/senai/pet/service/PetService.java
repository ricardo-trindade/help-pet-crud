package com.senai.pet.service;

import com.senai.pet.repository.PetRepository;

public class PetService {

    private PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
}


