package strategy.strategies;

import strategy.domain.Order;

import java.util.List;

public class UnregisteredOrderStrategy implements OrderStrategy {
    
    @Override
    public void approveShopCart(List<String> shoppingList, Order order) {
        order.setProductList(shoppingList);
        System.out.println("Shopping list of the order: " + order + " was approved");
    }

    @Override
    public void approveDeliveryInformation(String address, Order order) {
        order.setAddress(address);
        System.out.println("Delivery for the order: " + order + "will be sent to the address: " + address);
    }

    @Override
    public void order(Order order) {
        System.out.println("Order was fully approved and taken into the work");
    }
}
