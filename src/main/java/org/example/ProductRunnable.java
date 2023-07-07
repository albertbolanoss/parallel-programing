package org.example;

public class ProductRunnable implements Runnable {
  private final ProductService productService;

  private String productId;

  public ProductRunnable(ProductService productService, String productId) {
    this.productService = productService;
    this.productId =  productId;
  }

  @Override
  public void run() {
    try {
      productId = productService.getProduct(productId);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
