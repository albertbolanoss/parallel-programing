package org.example.blockingQueue.secondexample;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
  protected final BlockingQueue queue;
  public Producer(BlockingQueue queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    try {
      queue.put("1");
      Thread.sleep(2000);
      queue.put("2");
      Thread.sleep(2000);
      queue.put("3");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
