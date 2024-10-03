package org.example;

public class MinhaRunnable implements Runnable {

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": rodando");
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
        }
        System.out.println(name + "; FIM");
    }
}
