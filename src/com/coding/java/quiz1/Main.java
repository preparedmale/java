package com.coding.java.quiz1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(29);
        Apple apple2 = new Apple();
        apple.setWeight(31);

        List<Apple> appleList = new ArrayList<>();
        appleList.add(apple);
        appleList.add(apple2);

        Printer.prettyPrintApple(appleList, new AppleLightWeightPredicate());
    }
}
