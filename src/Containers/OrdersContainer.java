package Containers;

import Cart.Order;
import UserPackage.User;

import java.util.HashMap;

public class OrdersContainer {
    private static OrdersContainer instance;
    private static HashMap<User, Order> orders;

    private OrdersContainer(){
        orders = new HashMap<>();
    }
    public static OrdersContainer getInstance(){
        if (instance!=null){
            return instance;
        }
        return instance = new OrdersContainer();
    }

}
