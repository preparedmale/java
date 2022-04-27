package com.coding.java.quiz1;

import java.util.List;

public class Printer {
    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate applePredicate) {
        for (Apple apple : inventory) {
            System.out.println("is this apple light?: " + applePredicate.test(apple));
        }
    }
}
