package UserPackage;

import Cart.Order;
import enums.AccountStatus;
import enums.OrderStatus;

public class Admin extends User implements AdminInterface {


    public Admin(){
    }


    //Admin functions
    @Override
    public void setAccountStatus(Client client, AccountStatus status) {
        client.setAccountStatus(status);
    }

    @Override
    public void setOrderStatus(Order order, OrderStatus orderStatus) {
        order.setStatus(orderStatus);

    }
}
