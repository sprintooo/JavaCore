package com.sprinto.javaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

public class JavaPriorityQueue {

    public static void main(String [] args){

        class Person {
            String name;
            Integer age;

            public Person(String name, Integer age){
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 25));
        list.add(new Person("Bob", 30));
        list.add(new Person("Charlie", 22));
        list.add(new Person("Zavid", 27));
        list.add(new Person("Eva", 27));
        list.add(new Person("Frank", 31));
        list.add(new Person("Grace", 24));
        list.add(new Person("Hannah", 29));
        list.add(new Person("Ian", 26));


        PriorityQueue<Person> pq = new PriorityQueue<>((a, b) -> {
            if (Objects.equals(a.age, b.age)){
                return a.name.compareTo(b.name);
            }
            return a.age - b.age;
        });
        pq.addAll(list);

        while (!pq.isEmpty()){
            System.out.println(pq.poll().toString());
        }
    }
}
