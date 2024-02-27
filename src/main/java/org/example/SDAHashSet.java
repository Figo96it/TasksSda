package org.example;

import java.util.*;

public class SDAHashSet<E> extends AbstractSet<E> {

    private static final Object DUMMY = new Object();

    private HashMap<E, Object> set;

    public SDAHashSet() {
        set = new HashMap<>();
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
        return set.put(e, DUMMY) == null;
    }

    @Override
    public boolean remove(Object o){
        return set.remove(o) == DUMMY;
    }

    @Override
    public void clear(){
        set.clear();
    }
}
