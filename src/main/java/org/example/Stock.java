package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Stock {
    private Map<Product, Integer> stock;

    public Stock(){
        stock = new HashMap<>();
    }

    public Stock(Map<Product, Integer> stock) {
        this.stock = stock;
    }

    public Map<Product, Integer> getStock() {
        return stock;
    }

    public void setStock(Map<Product, Integer> stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock1 = (Stock) o;
        return Objects.equals(stock, stock1.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(stock);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stock=" + stock +
                '}';
    }

    //add products to stock
    public void addProductsToStock(Product product, Integer amount){
        stock.put(product, amount);
    }
}

