package com.company;

public class Main {

    public static void main(String[] args) {

        City myCity = new City();
        City best = new City(400000,"Vilnus" );

        myCity.PrintInfo();
        System.out.println("_______________________________________________________________________");
        best.PrintInfo();
    }
}


