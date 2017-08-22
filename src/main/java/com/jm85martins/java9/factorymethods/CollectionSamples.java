package com.jm85martins.java9.factorymethods;

import java.util.List;
import java.util.Set;

/**
 * Created by jorgemartins on 22/08/2017.
 */
public class CollectionSamples {

    public void play() {
        //create a immutable list of strings
        List<String> namesList = List.of("Jorge", "Antonio", "Jose");

        try {
            namesList.add("Bob");
        } catch (UnsupportedOperationException e){

        }
        System.out.println(namesList);

        Set<String> cities = null;
        try {
            Set.of("Porto", "Lisbon", "Coimbra", "Porto");
        } catch (IllegalArgumentException e){
            cities = Set.of("Porto", "Lisbon", "Coimbra");
            System.out.println(cities);
        }
    }
}
