package org.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal lara = new Animal("Lara", 3);
        Animal tobi = new Animal("Tobi", 8);
        Animal reksio = new Animal("Reksio", 5);

        List animals = new ArrayList<>();

        animals.add(lara);
        animals.add(tobi);
        animals.add(1,reksio);
        animals.add(reksio);
        animals.add(tobi);
        animals.add(reksio);

        System.out.println(animals.toString());

        animals.remove(reksio);

        System.out.println(animals.toString());

        animals.remove(new Animal("Reksio",5));
        System.out.println(animals.toString());

        Object o = animals.get(0);
        System.out.println(o);

        animals.sort(Comparator.comparingInt(Animal::getAge).reversed());
        System.out.println("sort" +animals);
    }
}