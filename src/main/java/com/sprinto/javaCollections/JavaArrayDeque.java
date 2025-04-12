package com.sprinto.javaCollections;

import java.util.ArrayDeque;

public class JavaArrayDeque {

    public static void main(String[] args){

        // Queue
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offerLast(1);
        q.offerLast(3);
        q.offerLast(7);

        /*for(int e: q){
            System.out.println(e);
        }*/

        // Stack
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.offerLast(4);
        s.offerLast(5);
        s.offerLast(9);
        s.offerLast(6);

        // Deque
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(4);
        dq.offerLast(6);
        dq.offerFirst(9);

        for(int e: dq){
            System.out.println(e);
        }
    }
}
