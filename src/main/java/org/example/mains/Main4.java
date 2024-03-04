package org.example.mains;

import org.example.runner.Runner;

import java.util.Arrays;

public class Main4 {

    //Exercise 16
    public static void main(String[] args) {
        Runner[] runner = Runner.values();
        System.out.println(Runner.getFitnessLevel(120));
    }
}
