package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Exercise 4
public class Storage<K, V> {

    private Map<K, List<V>> map;

    public Storage(Map<K, List<V>> map) {
        this.map = map;
    }

    public void addToStorage(K key, V value) {
        map.computeIfAbsent(key, K -> new ArrayList<>()).add(value);
    }

    public void printValues(K key) {
        System.out.println(map.entrySet().stream()
                .filter(m -> m.getKey().equals(key))
                .map(v -> "Values: " + v.getValue())
                .collect(Collectors.joining()));
    }

    public void findValues(V value) {
        System.out.println(map.entrySet().stream()
                .filter(m -> m.getValue().contains(value))
                .map(v -> "Key: " + v.getKey() + ", Values: " + v.getValue())
                .collect(Collectors.joining(",\n", "", ".")));
    }

    public Map<K, List<V>> getMap() {
        return map;
    }

    public void setMap(Map<K, List<V>> map) {
        this.map = map;
    }
}
