package org.example;

import java.time.LocalDateTime;

public class MinhaThread extends Thread {

    public void run() {
        System.out.println("Executando Thread: " + LocalDateTime.now());
    }
}
