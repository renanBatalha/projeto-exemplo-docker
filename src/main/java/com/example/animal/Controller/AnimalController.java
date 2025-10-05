package com.example.animal.Controller;

import com.example.animal.Service.AnimalService;
import com.example.animal.Model.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/animals")
public class AnimalController {


    private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    // Endpoint para listar todos os animais
    @GetMapping
    public List<Animal> listarTodos() {
        return animalService.listarTodos();
    }

    // Endpoint para criar um novo animal
    @PostMapping
    public Long criarAnimal(@RequestBody Animal animal) {
        return animalService.criarAnimal(animal);
    }
}

