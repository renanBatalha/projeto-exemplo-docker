package com.example.animal.Service;

import com.example.animal.Model.Animal;
import com.example.animal.Repository.AnimalRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Long criarAnimal(Animal animal){
        animalRepository.save(animal);
        return animal.getId();
    }

    // Novo método para listar todos os animais
    public List<Animal> listarTodos() {
        return animalRepository.findAll();
    }

}
