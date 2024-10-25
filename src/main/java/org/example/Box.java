package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Box <T, V extends Number & Comparable<V>> implements BoxOperations<V> {
    private T genericAttribute;
    private V largestValue;
    private String name;

    public Box(String name) {
        this.name = name;
    }

    public boolean hasSameName(Box<?, ?> otherBox) {
        if(name.equals(otherBox.name)) {
            return true;
        } else {
            return false;
        }
    }

    public T castValue(Object value) {
        return (T)value;
    }

    @Override
    public V setLargestValueFromList(List<V> list) {
        largestValue = Collections.max(list);
        return largestValue;
    }

    public T getGenericAttribute() {
        return genericAttribute;
    }

    public void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
    }

    @Override
    public V getLargestValue() {

        return largestValue;
    }

    @Override
    public void setLargestValue(V firstValue, V secondValue) {
        if (firstValue.doubleValue() > secondValue.doubleValue()){
            largestValue = firstValue;
        }
        else {
            largestValue = secondValue;
        }
    }



}
