package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {
    private List<Product> products;

    public ProductRepo(){
        products = new ArrayList<>();
    }

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    //get all products
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(products);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }

    //add products to list
    public void addProduct(Product product){
        products.add(product);
    }

    //remove product from list
    public void removeProduct(Product product){
        products.remove(product);
    }

    //get single product by productId
    public Product findProductById(int productId){
        for(Product foundProduct:products) {
            if (foundProduct.productId() == productId){
                return foundProduct;
            }
        }
        return null;
    }
}
