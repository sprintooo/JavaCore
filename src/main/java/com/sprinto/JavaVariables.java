package com.sprinto;

public class JavaVariables {

    // Primitive Type Variables
    boolean isJavaFun = true; // boolean type
    byte smallNumber = 127; // byte type (8-bit signed integer)
    char letter = 'A'; // char type (16-bit Unicode character)
    short shortNumber = 32767; // short type (16-bit signed integer)
    int number = 100; // int type (32-bit signed integer)
    long bigNumber = 10000000000L; // long type (64-bit signed integer, 'L' is mandatory for large values)
    float decimalValue = 10.5f; // float type (32-bit floating point, 'f' is mandatory)
    double largeDecimalValue = 20.99; // double type (64-bit floating point)

    // Reference Type Variables
    String message = "Hello, Java!"; // String (reference type)
    int[] numbersArray = {1, 2, 3, 4, 5}; // Array (reference type)

    // Static/Class Variable
    static int staticCounter = 0; // Shared across all instances of the class

    // Final Variable (Constant)
    final int CONSTANT_VALUE = 100; // Immutable once assigned
    static final double PI = 3.14159; // Static Final (constant like in C, only one copy exists)

    // Local Variable (Declared inside a method)
    public void localVariableExample() {
        int localVar = 10; // Local variable
        System.out.println("Local Variable: " + localVar);
    }

    // Method Parameter
    public void methodWithParameter(int param) {
        System.out.println("Method Parameter: " + param);
    }

    // Constructor Parameter
    public JavaVariables(int param) {
        System.out.println("Constructor Parameter: " + param);
    }

    // Type Conversion
    public void typeConversion() {
        // Widening Conversion (Automatic Conversion)
        int intVal = 50;
        double doubleVal = intVal; // int to double (widening conversion)
        System.out.println("Widening Conversion: " + doubleVal);

        // Narrowing Conversion (Explicit Conversion / Downcasting)
        double decimal = 10.99;
        int narrowedInt = (int) decimal; // Explicit conversion
        System.out.println("Narrowing Conversion: " + narrowedInt);

        // Promotion during Expression
        byte b1 = 10;
        byte b2 = 20;
        int result = b1 + b2; // Byte is promoted to int automatically
        System.out.println("Promotion during Expression: " + result);

        // Explicit Casting during Expression
        int num1 = 100;
        byte byteResult = (byte) (num1 / 2); // Explicit cast required
        System.out.println("Explicit Casting during Expression: " + byteResult);
    }

    // Wrapper Classes and Autoboxing/Unboxing
    public void wrapperExample() {
        Integer objInt = 10; // Autoboxing (primitive to object)
        int primitiveInt = objInt; // Unboxing (object to primitive)
        System.out.println("Autoboxing: " + objInt + ", Unboxing: " + primitiveInt);
    }

    public static void main(String[] args) {
        JavaVariables obj = new JavaVariables(5);
        obj.localVariableExample();
        obj.methodWithParameter(20);
        obj.typeConversion();
        obj.wrapperExample();

        // Static Variable
        System.out.println("Static Variable: " + staticCounter);

        // Final Variable
        System.out.println("Final Variable: " + obj.CONSTANT_VALUE);
        System.out.println("Static Final (Constant): " + PI);
    }
}
class Person {
    final static String name = "";
    final int age = 24;
}

