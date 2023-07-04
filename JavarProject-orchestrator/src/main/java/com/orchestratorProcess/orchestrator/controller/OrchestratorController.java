package com.orchestratorProcess.orchestrator.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.orchestratorProcess.orchestrator.model.Vets;
import com.orchestratorProcess.orchestrator.model.Animals;

import com.orchestratorProcess.orchestrator.resources.UserResources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrchestratorController {

    @Autowired(required = true)
    private RestTemplate restTemplate;

    @Value("${spring.services.animal.endpoints.getAnimalByID}")
    private String getAnimalByID_URI;

    @Value("${spring.services.animal.endpoints.getAnimalByName}")
    private String getAnimalByName_URI;

    @Value("${spring.services.animal.endpoints.saveAnimal}")
    private String saveAnimal_URI;

    @Value("${spring.services.animal.endpoints.getVetByID}")
    private String getVetByID_URI;

    @Value("${spring.services.animal.endpoints.saveVet}")
    private String saveVet_URI;



    @GetMapping("/animalByID")
    public ResponseEntity<?> getAnimalsID(@RequestParam String username, @RequestParam String animalIdParamText){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        String urlTemplate = UriComponentsBuilder.fromHttpUrl(getAnimalByID_URI).queryParam("username", "{username}").queryParam("animalIdParamText", "{animalIdParamText}").encode().toUriString();
        Map<String,String> params = new HashMap<String, String>();
        params.put("username", username);
        params.put("animalIdParamText", animalIdParamText);
        return restTemplate.exchange(urlTemplate, HttpMethod.GET,entity, List.class,params);
    }

    @GetMapping("/animalByName")
    public ResponseEntity<?> getAnimalsName(@RequestParam String username, @RequestParam String animalNameParamText){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        String urlTemplate = UriComponentsBuilder.fromHttpUrl(getAnimalByName_URI).queryParam("username", "{username}").queryParam("animalNameParamText", "{animalNameParamText}").encode().toUriString();
        Map<String,String> params = new HashMap<String, String>();
        params.put("username", username);
        params.put("animalNameParamText", animalNameParamText);
        return restTemplate.exchange(urlTemplate, HttpMethod.GET,entity, List.class,params);
    }

    @GetMapping("/vetByID")
    public ResponseEntity<?> getVetName(@RequestParam String username, @RequestParam String vetIdParamText){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        String urlTemplate = UriComponentsBuilder.fromHttpUrl(getVetByID_URI).queryParam("username", "{username}").queryParam("vetIdParamText", "{vetIdParamText}").encode().toUriString();
        Map<String,String> params = new HashMap<String, String>();
        params.put("username", username);
        params.put("vetIdParamText", vetIdParamText);
        return restTemplate.exchange(urlTemplate, HttpMethod.GET,entity, List.class,params);
    }



    @PutMapping("/saveAnimal/{username}")
    public ResponseEntity<?> getVetName(@PathVariable String username, @RequestBody Animals animal){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(animal, headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("username", username);
        return restTemplate.exchange(saveAnimal_URI,HttpMethod.PUT, entity, String.class, params);
    }


    @PutMapping("/saveVet/{username}")
    public ResponseEntity<?> getVetName(@PathVariable String username, @RequestBody Vets vet){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(vet, headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("username", username);
        return restTemplate.exchange(saveVet_URI,HttpMethod.PUT, entity, String.class, params);
    }










}
