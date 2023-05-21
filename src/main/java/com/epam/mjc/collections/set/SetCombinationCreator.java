package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet0 = new HashSet<>(firstSet);
        resultSet0.retainAll(secondSet);
        resultSet0.removeAll(thirdSet);

        Set<String> resultSet1 = new HashSet<>(thirdSet);
        resultSet1.removeAll(firstSet);
        resultSet1.removeAll(secondSet);

        Set<String> resultSet = new HashSet<>(resultSet0);
        resultSet.addAll(resultSet1);

        return resultSet;
    }
}
