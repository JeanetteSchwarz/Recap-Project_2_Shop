package org.example;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    //check if product is on stock and place new order if true, send message
    public void placeNewOrder(Order order){
        if (productRepo.isOnStock(order.product())){
        orderRepo.addOrder(order);
        double totalPrice = calculateTotalPrice(order, order.product());
        System.out.println("Order successful.");
        System.out.println("The total price of your order is: " + totalPrice);
        }
        else System.out.println("Sorry, this product is out of stock.");
    }

    //calculate the total price of order
    public double calculateTotalPrice(Order order, Product product) {
        return order.orderAmount() * product.pricePerUnit();

    }

}
