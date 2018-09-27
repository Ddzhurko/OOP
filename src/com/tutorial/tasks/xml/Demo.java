package com.tutorial.tasks.xml;

import java.util.ArrayList;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Tariff tariff1 = new Tariff("A", "Vodafone", 30, 0, 1,
                1, 1, 1, 5, 20);
        Tariff tariff2 = new Tariff("B", "Kyivstar", 20, 0, 1,
                1, 1, 1, 5, 20);
        Tariff tariff3 = new Tariff("C", "Lafe", 30, 0, 1,
                1, 1, 1, 5, 20);
        Tariff tariff4 = new Tariff("D", "Beeline", 60, 0, 1,
                1, 1, 1, 5, 20);

        ArrayList<Tariff> list = new ArrayList<>();
        list.add(tariff1);
        list.add(tariff2);
        list.add(tariff3);
        list.add(tariff4);

            System.out.println(list.toString());
            System.out.println("Total tariffs: " + list.size());


        list.sort(Comparator.comparing(Tariff::getPayroll));
        System.out.println(list);
        list.sort(Comparator.comparing(Tariff::getName));

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getPayroll() > 50)
                System.out.println("The payroll more than 50 for " + list.get(i));
        }


    }


}
