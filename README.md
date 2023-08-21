# Java Basic SpringBoot App

The following project presents a SpringBoot app that provides 3 micro-services:  
  
1 = serviceNum1 (Handle Animals)  
2 = serviceNum2 (Handle Vets)  
3 = JavaProject-orchestrator (Orchestrator)


# Services
## Handle Animals:
This service lets you save animal objects in a list, for a specific username. So, each username will have their own database (local List<animals>) of animals. This microservice lets you save animals and push it on the database as well as to retireve them by Name and by ID. 

## Handle Vets:
The vets microservice works the same way as the Animals one. You save vets to a specific username and you can add new entries or retrieve them by ID. The main diference between Handle Animals and Handle Vets is that Handle Animals has two get requests which return animals by specific name and ID, while Handle Vets only returns Vets by ID.

## Orchestrator:
This microservice only calls all other micro services.

# Testing

## Example of Commands for Testing
### Get Vet by ID: (Get Req)
http://localhost:8080/vetByID?username=Shinobi123&vetIdParamText=118 ---> In this example we are using the username "Shinobi123" and an ID of "118"

### Get Animal by ID: (Get Req)
http://localhost:8080/animalByID?username=Shinobi123&animalIdParamText=222 ---> In this example we are using the username "Shinobi123" and an ID of "222"

### Get Animal by Name: (Get Req)
http://localhost:8080/animalByName?username=Shinobi123&animalNameParamText=Zuko ---> In this example we are using the username "Shinobi123" and a animalNameParamText of "Zuko"

## Each of these will return you at first 0 results since you have not populated the respective username databases. So, use these examples to upload new objects

### Save Vet: (Put Req)
http://localhost:8080/saveVet/Shinobi123

Use the following body example:

{
    "vetId": "118",
    "vetName": "Veterinaria1",
    "vetSpeciality": "Dogs",
    "vetExperience": "8",
    "vetClinic": "ABCD"
}

{
    "vetId": "119",
    "vetName": "Veterinaria2",
    "vetSpeciality": "Cats",
    "vetExperience": "9",
    "vetClinic": "GHFT"
}

### Save Animal: (Put Req)
http://localhost:8080/saveAnimal/Shinobi123

{
    "animalId": "222",
    "animalName": "Zuko",
    "animalType": "Dog",
    "animalDob": "May2023",
    "animalBreed": "AusCat",
    "animalOwner": "JuanJoseGomez",
    "vetId": 1234
}

{
    "animalId": "221",
    "animalName": "Zuko",
    "animalType": "Dog",
    "animalDob": "May1999",
    "animalBreed": "GerShep",
    "animalOwner": "NicoleAbarca",
    "vetId": 1234
}

