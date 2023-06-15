package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ItemAdd itemAdd = new ItemAdd("IPhone", "Canada", 5, 2000, random.nextInt(9999)+1000);
        itemAdd.constructorList(itemAdd.items);
    }
}
