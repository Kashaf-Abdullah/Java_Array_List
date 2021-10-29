package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
ArrayList<ArrayList<String>> food=new ArrayList<>();
    ArrayList<String> bakery=new ArrayList<>();
    bakery.add(" cupccake");
    bakery.add(" donut");
    ArrayList<String>produce= new ArrayList<>();
    produce.add("chicken");
    produce.add("biryani");
    ArrayList<String >drinks=new ArrayList<>();
    drinks.add("coca cola");
    drinks.add("fanta");
    //System.out.println(drinks);
    food.add(bakery);
    food.add(produce);
    food.add(drinks);
    System.out.println(food.get(0).get(0));


    }
}
