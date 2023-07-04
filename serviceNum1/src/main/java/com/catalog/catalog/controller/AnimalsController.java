package com.catalog.catalog.controller;


import com.catalog.catalog.resources.Util;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import com.catalog.catalog.model.Animals;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AnimalsController {


    @GetMapping("/getByID")
    public ResponseEntity<List<Animals>> getAnimalsByID (@RequestParam String username, @RequestParam String animalIdParamText){
        Util.getInstance();
        return new ResponseEntity<>(Util.getInstance().getAnimalInfo_animalID(username,animalIdParamText), HttpStatus.OK);
    }


    @GetMapping("/getByName")
    public ResponseEntity<List<Animals>> getAnimalsByName (@RequestParam String username, @RequestParam String animalNameParamText){
        Util.getInstance();
        return new ResponseEntity<>(Util.getInstance().getAnimalInfo_animalName(username,animalNameParamText), HttpStatus.OK);
    }


    @PutMapping("/save/{username}")
    public ResponseEntity<String> save(@PathVariable String username, @RequestBody Animals animal){
        List<Animals> animals = Util.getInstance().getValue(username);
        if(animals == null) {
            animals = new ArrayList<Animals>();
        }
        animals.add(new Animals(animal.getAnimalId(), animal.getAnimalName(), animal.getAnimalType(), animal.getAnimalDob(), animal.getAnimalBreed(), animal.getAnimalOwner(), animal.getVetId()));
        Util.getInstance().add(username, animals);
        return new ResponseEntity<>("Success" , HttpStatus.OK);
    }

}





