package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> keysMap = new HashMap<>();
        List<String> keySt = new ArrayList<>();
        for (String k : sourceMap.keySet()) {
            keysMap.put(k.length(), new HashSet<>());
            keySt.add(k);
        }
        for (String k : keySt) {
            keysMap.get(k.length()).add(k);
        }
        return keysMap;
    }
}
