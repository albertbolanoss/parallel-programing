package org.example.blockingQueue.secondexample;

import java.util.concurrent.BlockingQueue;

public class Consumer  implements Runnable{

  protected final BlockingQueue queue;

  public Consumer(BlockingQueue queue) {
    this.queue = queue;
  }

  public void run() {
    try {
      System.out.println(queue.take());
      System.out.println(queue.take());
      System.out.println(queue.take());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}