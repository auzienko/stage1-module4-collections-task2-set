package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();

        for (Integer i : sourceList) {
            if (i % 2 != 0) {
                resultSet.add(i);
                resultSet.add(i * 2);
            } else {
                int j = i;
                while (j % 2 == 0) {
                    resultSet.add(j);
                    j /= 2;
                }
                resultSet.add(j);
            }
        }
        return resultSet;
    }
}
