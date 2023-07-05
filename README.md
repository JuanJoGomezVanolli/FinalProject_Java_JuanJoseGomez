# FinalProject_Java_JuanJoseGomez
Final Java Fundamentals Project Juan Jose Gomez IBM

The following project presents a SpringBoot app that provides 3 micro-services:
      1 = Handle Animals
      2 = Handle Vets
      3 = Orchestrator

# Handle Animals:
This service lets you save animal objects for a specific username. So, each username will have their own database of animals. This microservice lets you save animals and push it on the database as well as to retireve them by Name and by ID. 

# Handle Vets:
The vets microservice works the same way as the Animals one. You save vets to a specific username and you can add new entries or retrieve them by ID.

# Orchestrator:
This microservice the only thing that does is to call all other micro services.

# Example of Commands for Testing
Get Vet by ID: (Get Req)
http://localhost:8080/vetByID?username=Shinobi123&vetIdParamText=117 ---> In this example we are using the username "Shinobi123" and an ID of "117"

Get Animal by ID: (Get Req)
http://localhost:8080/animalByID?username=Shinobi123&animalIdParamText=116

Get Animal by Name: (Get Req)
http://localhost:8080/animalByName?username=Shinobi123&animalNameParamText=Flick

## Each of these will return you at first 0 results since you have not populated the respective username databases. So, use these examples to upload new objects

Save Vet: (Put Req)
http://localhost:8080/saveVet/Shinobi123

Use the following body example:

{
    "vetId": "118",
    "vetName": "Veterinaria2",
    "vetSpeciality": "Reptiles",
    "vetExperience": "8",
    "vetClinic": "JKHG"
}

Save Animal: (Put Req)

{
    "animalId": "222",
    "animalName": "Zuko",
    "animalType": "Dog",
    "animalDob": "May2023",
    "animalBreed": "ACDZ",
    "animalOwner": "JuanJoseGomez",
    "vetId": 1234
}

