package org.example;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinaryOperator<Integer> sum = (Integer x, Integer y) -> x + y;
        System.out.println(sum.apply(1, 2));
    }
}