package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo{
    private Map<Integer, Order> orders;

    public OrderMapRepo(){
        orders = new HashMap<>();
    }

    @Override
    public void addOrder(Order order) {
        orders.put(order.orderId(), order);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order.orderId(), order);
    }

    @Override
    public Order getOrderById(int orderId){
        return orders.get(orderId);
    }

    @Override
    public Order[] getOrderList() {
        return orders.values().toArray(new Order[0]);
    }

}
