package com.coding.java.quiz1;

public class AppleLightWeightPredicate implements ApplePredicate {
    public static final int LIGHT_WEIGHT_STANDARD = 30;

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() <= LIGHT_WEIGHT_STANDARD ? true : false;
    }
}
