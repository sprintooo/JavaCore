package com.sprinto.javaBasics;

import java.util.Scanner;

public class JavaString {

    public void main(){
        String a = "Hello world!";
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next().trim();
        // Write your code here

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
