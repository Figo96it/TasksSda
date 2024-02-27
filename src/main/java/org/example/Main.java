package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Zorro", "Adam", "Java", "Komputer", "Telefon");
        System.out.println(sortedList(stringList));
    }


    //Exercise 1
    public static List<String> sortedList(List<String> stringList) {
        return stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}