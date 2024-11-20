package com.neoteric.java_29102024.product;

public  class Product implements  Comparable<Product> {
    private  int productId;
    private  double price;
     private  String name;

    public int getproductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product(int productId, double price, String name) {
        this.productId = productId;
        this.price = price;
        this.name = name;
    }



    @Override
    public int compareTo(Product product) {
        return Integer.compare(this.productId,product.productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
