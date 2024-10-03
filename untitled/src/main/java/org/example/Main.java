package org.example;

public class Main {
    public static void main(String[] args) {



        MinhaThread minhaThread = new MinhaThread();
        minhaThread.start();

        MinhaRunnable minhaRunnable = new MinhaRunnable();
        Thread outraThread = new Thread(minhaRunnable);
        outraThread.start();
    }
}