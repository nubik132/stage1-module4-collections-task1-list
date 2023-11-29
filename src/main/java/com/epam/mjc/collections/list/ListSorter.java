package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        for (int i = 0; i < sourceList.size() - 1; i++) {
            for (int j = i + 1; j < sourceList.size(); j++) {
                if (comparator.compare(
                        sourceList.get(i),
                        sourceList.get(j)) > 0)
                {
                    String tmp = sourceList.get(i);
                    sourceList.set(i, sourceList.get(j));
                    sourceList.set(j, tmp);
                }
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int result = intA * intA - intB * intB;
        return result != 0 ? result : intA - intB ;
    }
}
