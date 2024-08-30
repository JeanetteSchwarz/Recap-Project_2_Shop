package org.example;

public class Main {
    public static void main(String[] args){

        //create some test-products
        Product cup = new Product(101, "Cup", 8.90, 20);
        Product plate = new Product(102, "Plate", 14.90, 15);
        Product bowl = new Product(103, "Bowl", 10.90, 18);
        Product glas = new Product(104, "Glas", 7.90, 12);

        //create new ProductRepo
        ProductRepo inventory = new ProductRepo();

        //add test-products to new inventory
        inventory.addProduct(cup);
        inventory.addProduct(plate);
        inventory.addProduct(bowl);
        inventory.addProduct(glas);

        //System.out.println(inventory);

        //create new OrderListRepo
        OrderListRepo allOrdersMonday = new OrderListRepo();

        //create new ShopService
        ShopService shopService = new ShopService(inventory, allOrdersMonday);

        //create test order
        Order berndsOrder = new Order(301, "Bernd", plate, 2);
        Order irmisOrder = new Order(302, "Irmi", bowl, 4);

        //placeorder trough Shopservice
        //shopService.placeNewOrder(berndsOrder);
        //shopService.placeNewOrder(irmisOrder);

        //System.out.println(allOrdersMonday);

        //calculate the price for Bernds order
        //System.out.println(shopService.calculateTotalPrice(berndsOrder, plate));

        //find product by id
        //System.out.println(inventory.findProductById(104));

        //check stock for single product
        System.out.println(bowl.onStock());

        //place order and check new stock
        shopService.placeNewOrder(irmisOrder);







    }
}