package com.test;

public class HelloGit {
    public static void main(String[] args) {



        new Thread(() -> {
            for (int i = 1; i <=10 ; i++)
            {
                System.out.println(Thread.currentThread().getName());
            }
        },"input thread name").start();

        System.out.println("HelloGit");
    }
}
