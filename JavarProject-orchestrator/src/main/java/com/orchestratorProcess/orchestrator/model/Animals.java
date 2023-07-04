package com.orchestratorProcess.orchestrator.model;


//Creamos nuestro objeto de Animal, el cual va a almacenar la info de cada animal que hagamos.

public class Animals {

    // Declaramos cada uno de los atributos que va a tener
    private String animalId;
    private String animalName;
    private String animalType;
    private String animalDob;
    private String animalBreed;
    private String animalOwner;
    private int vetId;



    //Creamos un constructor el cual es super(); y ademas necesita recibir cada uno de los parametros
    public Animals(String animalId, String animalName, String animalType, String animalDob, String animalBreed, String animalOwner, int vetId) {
        super();
        this.animalId = animalId;
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalDob = animalDob;
        this.animalBreed = animalBreed;
        this.animalOwner = animalOwner;
        this.vetId = vetId;
    }


    // generamos los get y set de cada parametro
    public String getAnimalId() {
        return animalId;
    }

    public void setAniamlId(String aniamlId) {
        this.animalId = aniamlId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalDob() {
        return animalDob;
    }

    public void setAnimalDob(String animalDob) {
        this.animalDob = animalDob;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public String getAnimalOwner() {
        return animalOwner;
    }

    public void setAnimalOwner(String animalOwner) {
        this.animalOwner = animalOwner;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

}
