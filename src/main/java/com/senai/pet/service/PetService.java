package com.senai.pet.service;

import com.senai.pet.DTO.PetDTO;
import com.senai.pet.entity.Pet;
import com.senai.pet.repository.PetRepository;

public class PetService {

    private PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public String salvar(PetDTO dto) {
        Pet pet = new Pet(dto.getNome(), dto.getIdade(), dto.getPorte(), dto.getTipo(), dto.getRaca());
        return "Sagitrica
}


