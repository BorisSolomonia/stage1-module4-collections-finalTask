package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> sortList = new ArrayList<>();
        PriorityQueue<String> sortPrior = new PriorityQueue<>(Comparator.reverseOrder());
        for (String k : projects.keySet()) {
            if (projects.get(k).contains(developer)){
                sortPrior.add(k);
            }
        }
        for (String n : sortPrior) {
            sortList.add(sortPrior.poll());
        }
        return sortList;
    }
}
