package com.company;

import java.util.*;

public class Main {

    public static void main(String args[]) {

        int count[] = {34, 22,10,60,30,22};

        Set set = new HashSet();

        try {

            for(int i = 0; i < 5; i++) {

                set.add(count[i]);

            }

            System.out.println(set);

            TreeSet sortedSet = new TreeSet(set);

            System.out.println("Сұрыпталған тізім:");

            System.out.println(sortedSet);

            System.out.println("жиынның бірінші элементі: "+ (Integer)sortedSet.first());

            System.out.println("жиынның соңғы элементі: "+ (Integer)sortedSet.last());

        }

        catch(Exception e) {}

    }

}
