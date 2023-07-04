package com.catalog.catalog.model;


//Creamos nuestro objeto de Animal, el cual va a almacenar la info de cada animal que hagamos.

public class Vets {

    // Declaramos cada uno de los atributos que va a tener
    private String vetId;
    private String vetName;
    private String vetSpeciality;
    private String vetExperience;
    private String vetClinic;


    //Creamos un constructor el cual es super(); y ademas necesita recibir cada uno de los parametros
    public Vets(String vetId, String vetName, String vetSpeciality, String vetExperience, String vetClinic) {
        super();
        this.vetId = vetId;
        this.vetName = vetName;
        this.vetSpeciality = vetSpeciality;
        this.vetExperience = vetExperience;
        this.vetClinic = vetClinic;
    }


    // generamos los get y set de cada parametro


    public String getVetId() {
        return vetId;
    }

    public void setVetId(String vetId) {
        this.vetId = vetId;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getVetSpeciality() {
        return vetSpeciality;
    }

    public void setVetSpeciality(String vetSpeciality) {
        this.vetSpeciality = vetSpeciality;
    }

    public String getVetExperience() {
        return vetExperience;
    }

    public void setVetExperience(String vetExperience) {
        this.vetExperience = vetExperience;
    }

    public String getVetClinic() {
        return vetClinic;
    }

    public void setVetClinic(String vetClinic) {
        this.vetClinic = vetClinic;
    }
}
