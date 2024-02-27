package org.example;

import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Exercise 1
        List<String> stringList = List.of("Zorro", "adam", "Java", "komputer", "Telefon");
        System.out.println(sortedList(stringList));
        //Exercise 2
        System.out.println(sortedListCaseInsensitiveOrder(stringList));

        //Exercise 3
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 20);
        map.put("Python", 15);
        map.put("C++", 10);
        map.put("JavaScript", 2);
        printElements(map);

        //Exercise 4
        Map<String, List<String>> mapa = new HashMap<>();
        mapa.put("Klucz1", new ArrayList<>(List.of("1", "2", "3")));
        mapa.put("Klucz2", new ArrayList<>(List.of("4", "5")));
        mapa.put("Klucz3", new ArrayList<>(List.of("6")));
        Storage<String, String> storage = new Storage<>(mapa);
        storage.addToStorage("Klucz1", "4");
        storage.printValues("Klucz1");
        storage.findValues("4");

        System.out.println();

        //Exercise5
        SDAHashSet<String> set = new SDAHashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        System.out.println("Size: " + set.size());
        System.out.println("Contains 'Java': " + set.contains("Java"));

        set.remove("Python");
        System.out.println("Size after removal: " + set.size());

        set.clear();
        System.out.println("Size after clear: " + set.size());

        System.out.println();
        //Exercise 6
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Trzy");
        treeMap.put(1, "Jeden");
        treeMap.put(2, "Dwa");
        treeMap.put(4, "Cztery");

        System.out.println(treeMap);

        printFirstAndLastEntrySet(treeMap);

        System.out.println();
        //Exercise 7
        FirearmMagazine magazine = new FirearmMagazine(3);

        magazine.loadBullet("1");
        magazine.loadBullet("2");
        magazine.loadBullet("3");

        System.out.println("Is loaded: " + magazine.isLoaded());

        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();

        System.out.println("Is loaded: " + magazine.isLoaded());
    }

    //Exercise 6
    private static void printFirstAndLastEntrySet(TreeMap<Integer, String> treeMap) {
        System.out.println("FirstSet: " + treeMap.firstEntry());
        System.out.println("LastSet: " + treeMap.lastEntry());
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