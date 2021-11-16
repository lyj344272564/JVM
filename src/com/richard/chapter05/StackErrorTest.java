package com.richard.chapter05;

public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
}
