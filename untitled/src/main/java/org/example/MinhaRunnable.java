package org.example;

public class MinhaRunnable implements Runnable {

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": rodando");
        for (int i = 0; i <= 5000; i++) {
            System.out.println(name + ": " + i);

            if (name.equals("thread 1")) {
                Thread.yield();
            //    System.out.println("Mudança de Prioridade");
            }
        }
        System.out.println(name + ": FIM");
    }
}
