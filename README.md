# FinalProject_Java_JuanJoseGomez
Final Java Fundamentals Project Juan Jose Gomez IBM

The following project presents a SpringBoot app that provides 3 micro-services:
      1 = Handle Animals
      2 = Handle Vets
      3 = Orchestrator

Handle Animals:
This service lets you save animal objects for a specific username. So, each username will have their own database of animals. This microservice lets you save animals and push it on the database as well as to retireve them by Name and by ID. 

Handle Vets:
The vets microservice works the same way as the Animals one. You save vets to a specific username and you can add new entries or retrieve them by ID.

Orchestrator:
This microservice the only thing that does is to call all other micro services.

