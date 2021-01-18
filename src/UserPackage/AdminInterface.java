package UserPackage;

import Cart.Order;
import enums.AccountStatus;
import enums.OrderStatus;

public interface AdminInterface {

   void setAccountStatus(User user, AccountStatus status);
   void setOrderStatus(Order order, OrderStatus orderStatus);
   void changeUserUsername(User user, String newUsername);
   void changeUserPassword(User user, String newPassword);
   void changeUserEmail(User user, String newEmail);

}
