package com.catalog.catalog.resources;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import com.catalog.catalog.model.Animals;




// Creamos la clase Util la cual basicamente va a manejar todos las instancias de Animals, ademas va a crear el mapa de la info de nuestors animales.
public class Util {

    //Tiene dos atributos, un HashMap en el que tiene un key=String y un value=List<Vets>
    //Y una instancia de tipo Util
    private static final HashMap<String, List<Animals>> map = new HashMap<>();
    private static Util instance;


    //Nota: No entiendo mucho esta funcion, pero basicamente sincroniza las instancias. Crea una en el caso que no haya ningun Util instance creado y si si esta creado entonces devuelve el ya creado.
    public static synchronized Util getInstance() {
        if(instance == null) {
            instance = new Util();
        }
        return instance;
    }


    //Creamos una funcion que devuelve una lista de objetos Animal. Esta lista es el valor del Key ingresado como parametro, del HashMap del objeto Util
    public List<Animals> getValue(String key){
        return map.get(key);
    }


    //Creamos una funcion que agrega una lista de objetos Animal. Esta lista agrega al HashMap la lista ingresada como parametro asociada al key = (nombre de usuario)
    public void add(String key, List<Animals> animals) {
        map.put(key, animals);
    }



    //Creamos una funcion que devuelve una lista de Animals. Esta funcion lo que hace es lo mismo que List<Animals> getValue pero luego se filtra nada mas con los valores ingresados como animalIdParamText
    public List<Animals> getAnimalInfo_animalID(String key, String animalIdParamText) {
        //Creamos una lista de Animales(Objetos)
        List<Animals> list = map.get(key);
        //Preguntamos is la lista esta vacia
        if (list == null){

            //Devolvemos una lista vacia
            return Collections.emptyList();
        } else {
            // Pasamos la lista completa a un stream y luego generamos una nueva lista la cual solo tiene los Animales(Objetos) que contienen un valor de atributo especifico.
            // En este caso el parametro es el animalOwner
            List<Animals> filteredList = list.stream().filter(obj -> obj.getAnimalId().equals(animalIdParamText)).collect(Collectors.toList());
            //Devolvemos la nueva lista
            return filteredList;
        }
    }

    //Creamos una funcion que devuelve una lista de Animals. Esta funcion lo que hace es lo mismo que List<Animals> getValue pero luego se filtra nada mas con los valores ingresados como animalNameParamText
    public List<Animals> getAnimalInfo_animalName(String key, String animalNameParamText) {
        List<Animals> list = map.get(key);
        //Preguntamos is la lista esta vacia
        if (list == null){
            //Devolvemos una lista vacia
            return Collections.emptyList();
        } else {
            List<Animals> filteredList = list.stream().filter(obj -> obj.getAnimalName().equals(animalNameParamText)).collect(Collectors.toList());
            return filteredList;
        }
    }





}
