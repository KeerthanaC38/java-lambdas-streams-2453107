package com.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Keerthana");
            }
        };
        greeting1.sayHello();

        Greeting greeting2 = () -> {
            System.out.println("Hello Keerthana");
        };
        greeting2.sayHello();
        Calculator calculator = (int a, int b) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return a*b + randomNumber;
        };
        System.out.println(calculator.calculate(1,2));

        IntBinaryOperator calculator1 = (int a, int b) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(20);
            return a*b + randomNumber;
        };
        System.out.println(calculator1.applyAsInt(1,2));
    }
}
