package com.test;

public class Crash {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("111");
        },"input thread name").start();
    }
}
