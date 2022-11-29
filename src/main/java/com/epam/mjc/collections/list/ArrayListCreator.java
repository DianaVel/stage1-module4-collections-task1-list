package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList <String> res = new ArrayList<>();
        for (int i=2; i<sourceList.size(); i+=3){
            res.add(sourceList.get(i));
            res.add(sourceList.get(i));
        }
        return res;
    }
}
