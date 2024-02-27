package org.example;

import java.util.*;


//Exercise 5
public class SDAHashSet<E> extends AbstractSet<E> {

    private static final Object object = new Object();

    private LinkedHashMap<E, Object> set;

    public SDAHashSet() {
        set = new LinkedHashMap<>();
    }

    @Override
    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean contains(Object o){
        return set.containsKey(o);
    }

    @Override
    public boolean add(E e){
        return set.put(e, object) == null;
    }

    @Override
    public boolean remove(Object o){
        return set.remove(o) == object;
    }

    @Override
    public void clear(){
        set.clear();
    }
}
