package org.example;

public record Product(int productId, String name, double pricePerUnit, int onStock) {

    //Wither
    public Product withOnStock(int newStock){
        return new Product(productId, name, pricePerUnit , newStock);
    }
}
