package UserPackage;

import Cart.Order;
import enums.CustomerStatus;
import enums.OrderStatus;

public interface AdminInterface {

   void setAccountStatus(Client client, CustomerStatus status);
   void setOrderStatus(Order order, OrderStatus orderStatus);
}
