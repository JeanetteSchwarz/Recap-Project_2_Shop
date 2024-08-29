package org.example;

import java.util.List;

public interface OrderRepo {
    void addOrder(Order order);

    void removeOrder(Order order);

    Order getOrderById(int orderId);

    Order[] getOrderList();

    double calculateTotalPrice(Order order, Product product);
}
