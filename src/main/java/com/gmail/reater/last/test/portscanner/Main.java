package com.gmail.reater.last.test.portscanner;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final int THREADS = 100;
    private static final int TIMEOUT = 100;
    private static final int MIN_PORT_NUMBER = 0;
    private static final int MAX_PORT_NUMBER = 65535;

    public static void main(String[] args) {
        scan("staging.metadata.by");
    }

    private static void scan(String host) {
        System.out.println("Scanning ports: ");
        ExecutorService executor = Executors.newFixedThreadPool(THREADS);

        for (int i = MIN_PORT_NUMBER; i <= MAX_PORT_NUMBER; i++) {
            final int port = i;
            executor.execute(() -> {
                var inetSocketAddress = new InetSocketAddress(host, port);
                try (var socket = new Socket()) {
                    socket.connect(inetSocketAddress, TIMEOUT);
                    System.out.printf("Host: %s, port %s is opened\n", host, port);
                } catch (IOException ignored) {
//                    System.err.println(e.getMessage());
                }
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finish!");
    }

    /*
        Ports:
        $ 20    -   FTP port
        $ 21    -   FTP port
        $ 25    -   SMTP port
        $ 80    -   HTTP port
        $ 443   -   HTTPS port
        $ 1500  -   Replication server (backup)
        $ 2224  -   SSH
        $ 5671  -   AMQP default
        $ 5672  -   AMQP default
        $ 15432 -   Postgres default
    */
}