package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class BoxCache<K, V extends BoxOperations>{

    K key;
    V value;
    HashMap<K, V> map= new HashMap<>();

    public void put(K key, V value) {
        map.put(key, value);
    }

    public Collection<V> getAll() {
        return map.values();
    }
}
