package org.example;

import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Zorro", "adam", "Java", "komputer", "Telefon");
        System.out.println(sortedList(stringList));
        System.out.println(sortedListCaseInsensitiveOrder(stringList));

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 20);
        map.put("Python", 15);
        map.put("C++", 10);
        map.put("JavaScript", 2);

        printElements(map);

        Map<String, List<String>> mapa = new HashMap<>();

        mapa.put("Klucz1", new ArrayList<>(List.of("1", "2", "3")));
        mapa.put("Klucz2", new ArrayList<>(List.of("4", "5")));
        mapa.put("Klucz3", new ArrayList<>(List.of("6")));
        Storage storage = new Storage(mapa);

        storage.addToStorage("Klucz1", "4");
        storage.printValues("Klucz1");
        storage.findValues("4");
    }


    //Exercise 1
    public static List<String> sortedList(List<String> stringList) {
        return stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    //Exercise 2
    public static List<String> sortedListCaseInsensitiveOrder(List<String> stringList) {
        return stringList.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList());
    }

    //Exercise 3
    public static void printElements(Map<?, ?> map) {
        String result = map.entrySet().stream()
                .map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
                .collect(Collectors.joining(",\n", "", "."));
        System.out.println(result);
    }

}