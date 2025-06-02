package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Lambdas
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


        // Streams API
        Integer[] scores = new Integer[]{1,2,3,4,5,6,7,8,9};
        Stream<Integer> scoresStream = Arrays.stream(scores);
        scoresStream.forEach(score->System.out.println(score));

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Grape");
        fruits.add("Guava");
        Stream<String> fruitsStream = fruits.stream();
        fruitsStream.sorted()
                .map(fruit-> fruit.toUpperCase())
                .filter(fruit->fruit.startsWith("G"))
                .forEach(fruit->System.out.println(fruit));
        Stream<String> veggies = Stream.of("carrot","cucumber","spinach");
        List<String> veggiesList = veggies.collect(Collectors.toList());
        System.out.println(veggiesList);

    }
}
