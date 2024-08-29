package org.example;

public class Main {
    public static void main(String[] args){

        //create some test-products
        Product cup = new Product(101, "Cup", 12);
        Product plate = new Product(102, "Plate", 24);
        Product bowl = new Product(103, "Bowl", 20);
        Product glas = new Product(104, "Glas", 15);

        //create new ProductRepo
        ProductRepo inventory = new ProductRepo();

        //add test-products to new inventory
        inventory.addProduct(cup);
        inventory.addProduct(plate);
        inventory.addProduct(bowl);
        inventory.addProduct(glas);

        System.out.println(inventory);

        //create new OrderListRepo
        OrderListRepo allOrdersMonday = new OrderListRepo();

        //create new ShopService
        ShopService shopService = new ShopService(inventory, allOrdersMonday);

        //create test order
        Order berndsOrder = new Order(301, "Bernd", plate);

        //placeorder trough Shopservice
        shopService.placeNewOrder(berndsOrder);





    }
}