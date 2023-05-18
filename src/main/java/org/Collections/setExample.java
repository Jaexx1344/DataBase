package org.Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class setExample {
    public static void main(String[] args) {
        Animal lara = new Animal("Lara", 3);
        Animal tobi = new Animal("Tobi", 8);
        Animal reksio = new Animal("Reksio", 5);

        HashSet<Animal> animals = new HashSet<>();

        animals.add(lara);
        animals.add(tobi);
        animals.add(reksio);

        System.out.println(animals);

        boolean isThere = animals.contains(new Animal("Lara",3));
        System.out.println(isThere);
        animals.add(new Animal("Lara",3));
        animals.add(new Animal("Lara",3));
        System.out.println(animals);

        TreeSet<Animal> animals1 = new TreeSet<>();

        animals1.add(lara);
        animals1.add(tobi);
        animals1.add(reksio);
        animals1.add(new Animal("Loki", 3));
        System.out.println(animals1);


    }
}
