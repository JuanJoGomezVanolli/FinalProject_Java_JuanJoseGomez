package com.catalog.catalog.controller;


import com.catalog.catalog.resources.Util;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import com.catalog.catalog.model.Vets;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class VetsController {


    @GetMapping("/getByID")
    public ResponseEntity<List<Vets>> getAnimalsByID (@RequestParam String username, @RequestParam String vetIdParamText){
        Util.getInstance();
        return new ResponseEntity<>(Util.getInstance().getVetInfo_vetID(username,vetIdParamText), HttpStatus.OK);
    }


    @PutMapping("/save/{username}")
    public ResponseEntity<String> save(@PathVariable String username, @RequestBody Vets vet){
        List<Vets> vets = Util.getInstance().getValue(username);
        if(vets == null) {
            vets = new ArrayList<Vets>();
        }
        vets.add(new Vets(vet.getVetId(), vet.getVetName(), vet.getVetSpeciality(), vet.getVetExperience(), vet.getVetClinic()));
        Util.getInstance().add(username, vets);
        return new ResponseEntity<>("Success" , HttpStatus.OK);
    }

}





