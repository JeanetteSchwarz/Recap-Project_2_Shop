package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo implements OrderRepo{

    public List<Order> orderList;

    public OrderListRepo() {
        orderList = new ArrayList<>();
    }

    public OrderListRepo(List<Order> orderList) {
        this.orderList = orderList;
    }

    //get all orders
    public Order[] getOrderList() {
        return orderList.toArray(new Order[0]);
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orderList, that.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orderList);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orderList=" + orderList +
                '}';
    }

    //add new orders
    public void addOrder(Order order){
        orderList.add(order);
    }

    //remove order
    public void removeOrder(Order order){
        orderList.remove(order);
    }

    //get order by orderId
    public Order getOrderById(int orderId){
        for(Order foundOrder:orderList) {
            if (foundOrder.orderId() == orderId){
                return foundOrder;
            }
        }
        return null;
    }

    //calculate the total price of order
    public double calculateTotalPrice(Order order, Product product){
        return order.orderAmount() * product.pricePerUnit();

    }
}
