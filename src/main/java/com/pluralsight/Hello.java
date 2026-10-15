package com.pluralsight;

public class Hello {

    public static void main(String[] args) {

        // call each method
        sayHello();
        sayGoodbye();
        sayGoodMorning();

    }

    //Prints method hello; "Hello, World!"
    public static void sayHello() {
        System.out.println("Hello, World!");

    }
    // Prints Goodbye method
    public static void sayGoodbye() {
        System.out.println("Goodbye");

    }
    // Prints good morning method
    public static void sayGoodMorning() {
        System.out.println("Good Morning");
    }
}

