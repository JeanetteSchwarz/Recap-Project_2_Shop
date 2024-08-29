package org.example;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    //place new order
    public void placeNewOrder(Order order){
        System.out.println("New Order incoming.");
    }

}
