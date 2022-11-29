package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList,new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        double aval = 5*Math.pow(Integer.valueOf(a),2)+3;
        double bval = 5*Math.pow(Integer.valueOf(b),2)+3;
       if(aval > bval){
           return 1;
       } else if (bval >aval) {
           return -1;
       }else {
           aval = Integer.valueOf(a);
           bval = Integer.valueOf(b);
           return aval > bval ? 1 : -1;
       }
    }
}
