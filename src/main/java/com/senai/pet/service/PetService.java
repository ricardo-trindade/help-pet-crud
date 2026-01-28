package com.senai.pet.service;

import com.senai.pet.DTO.PetDTO;
import com.senai.pet.entity.Pet;
import com.senai.pet.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService<PetDTO> {

    private static PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public static String salvarPet(com.senai.pet.DTO.PetDTO dto) {
        Pet pet = new Pet(dto.getNome(), dto.getIdade(), dto.getPorte(), dto.getTipo(), dto.getRaca());
        petRepository.save(pet);
        return "Salvo com sucesso";
    }
}


