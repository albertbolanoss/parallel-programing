package org.example.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {
  public static void main(String[] args) {
    int corePoolSize = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newFixedThreadPool(corePoolSize);

    Runnable runnable = () -> Math.random();
    var linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();

    ExecutorService executorService =
        new ThreadPoolExecutor(corePoolSize, corePoolSize, 5L, TimeUnit.SECONDS, linkedBlockingQueue);
  }
}
