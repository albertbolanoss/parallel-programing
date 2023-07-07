package org.example;

public class ProductService {
  public String getProduct(String productId) throws InterruptedException {
    Thread.sleep(1000);
    return "ProductId";
  }
}
