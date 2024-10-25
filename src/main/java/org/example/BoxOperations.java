package org.example;

import java.util.List;

public interface BoxOperations <V> {

    V getLargestValue();
    void setLargestValue(V first, V second);

    V setLargestValueFromList(List<V> list);
}
