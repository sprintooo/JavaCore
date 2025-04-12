package com.sprinto.javaCollections;

import java.util.ArrayList;
import java.util.List;

// We mostly gonna use arrayList only

public class JavaList {

    public static void main(String[] args){

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.set(0, 3);

        System.out.println(l1);
    }
}
