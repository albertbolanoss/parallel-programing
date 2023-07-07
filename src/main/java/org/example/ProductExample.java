package org.example;

public class ProductExample {
  public static void main(String[] args) throws InterruptedException {
    ProductService productService = new ProductService();
    Runnable productRunnable = new ProductRunnable(productService, "Id");
    Thread thread = new Thread(productRunnable);
    thread.start();
    // Here we can run several thread without block the start of the execution

    thread.join();
  }
}
