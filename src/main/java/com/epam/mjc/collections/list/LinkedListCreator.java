package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer value : sourceList) {
            if (value % 2 == 1) {
                list.addFirst(value);
            } else {
                list.addLast(value);
            }
        }
        return list;
    }
}
