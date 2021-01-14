package UserPackage;

import Cart.Order;
import enums.CustomerStatus;
import enums.OrderStatus;

public class Admin extends User implements AdminInterface {


    public Admin(String username, String password) {
        super(username, password);
    }


    //Admin functions
    @Override
    public void setAccountStatus(Client client, CustomerStatus status) {
        client.setAccountStatus(status);
    }

    @Override
    public void setOrderStatus(Order order, OrderStatus orderStatus) {
        order.setStatus(orderStatus);

    }
}
