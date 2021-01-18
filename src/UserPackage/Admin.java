package UserPackage;
import Cart.Order;
import Cart.Product;
import enums.AccountStatus;
import enums.OrderStatus;
public class Admin extends User implements AdminInterface {


    public Admin() {
    }

    //Admin functions

    @Override
    public void setAccountStatus(User user, AccountStatus status) {
        user.setStatus(status);
    }

    @Override
    public void setOrderStatus(Order order, OrderStatus orderStatus) {
        order.setStatus(orderStatus);
    }

    @Override
    public void changeUserUsername(User user, String newUsername) {
        user.setUsername(newUsername);
    }

    @Override
    public void changeUserPassword(User user, String newPassword) {
        user.setPassword(newPassword);
    }

    @Override
    public void changeUserEmail(User user, String newEmail) {
        user.setEmail(newEmail);
    }

    //Admins are clients, also!
    @Override
    public void addToCart(Product product) {
        super.addToCart(product);
    }

    public void addToCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            super.addToCart(product);
        }
    }

    @Override
    public void removeFromCart(Product product) {
        super.removeFromCart(product);
    }

    public void removeFromCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            super.removeFromCart(product);
        }
    }

}
