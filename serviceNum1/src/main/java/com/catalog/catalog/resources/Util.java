package com.catalog.catalog.resources;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import com.catalog.catalog.model.Animals;




// Creamos la clase Util la cual basicamente va a manejar todos las instancias de Animals, ademas va a crear el mapa de la info de nuestors animales.
public class Util {
    private static final HashMap<String, List<Animals>> map = new HashMap<>();
    private static Util instance;

    public static synchronized Util getInstance() {
        if(instance == null) {
            instance = new Util();
        }
        return instance;
    }

    public List<Animals> getValue(String key){
        return map.get(key);
    }

    public void add(String key, List<Animals> animals) {
        map.put(key, animals);
    }

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
