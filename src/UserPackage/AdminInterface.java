package UserPackage;

import Cart.Order;
import enums.AccountStatus;
import enums.OrderStatus;

public interface AdminInterface {

   void setAccountStatus(Client client, AccountStatus status);
   void setOrderStatus(Order order, OrderStatus orderStatus);
}
