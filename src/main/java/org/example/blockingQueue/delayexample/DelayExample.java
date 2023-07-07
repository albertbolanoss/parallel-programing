package org.example.blockingQueue.delayexample;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ThreadLocalRandom;

public class DelayExample {
  public static void main(String[] args) {
    BlockingQueue<DelayedElement<Integer>> queue = new DelayQueue<>();
    ThreadLocalRandom random = ThreadLocalRandom.current();
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < 7; i++) {
      int randomNumber = random.nextInt(10, 100);
      int initialDelayMillis = 5000;

      DelayedElement<Integer> element = new DelayedElement<>(randomNumber, initialDelayMillis);
      queue.offer(element);

    }

    // Wait 5 seconds before starting to process the queue (the queue is not processed until each item expires).
    System.out.println("Don't start until each element had expired (after 5 second)");
    while (!queue.isEmpty()) {
      try {
        DelayedElement<Integer> element = queue.take();
        Thread.sleep(100);
        System.out.println( String.format("Element: %s ::: Time: %s ::: Queue: %s", element, (System.currentTimeMillis() - startTime - 125), queue));

      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}
