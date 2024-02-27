package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {

    private Map<String, List<String>> map;

    public Storage(Map<String, List<String>> map) {
        this.map = map;
    }

    public void addToStorage(String key, String value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public void printValues(String key) {
        System.out.println(map.entrySet().stream()
                .filter(m -> m.getKey().equals(key))
                .map(v -> "Values: " + v.getValue())
                .collect(Collectors.joining()));
    }

    public void findValues(String value) {
        System.out.println(map.entrySet().stream()
                .filter(m -> m.getValue().contains(value))
                .map(v -> "Key: " + v.getKey() + ", Values: " + v.getValue())
                .collect(Collectors.joining(",\n", "", ".")));
    }

    public Map<String, List<String>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<String>> map) {
        this.map = map;
    }
}
