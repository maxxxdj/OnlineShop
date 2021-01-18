package UserPackage;

import Cart.Bill;
import Cart.Product;

public interface UserInterface {

    void changeUsername(String username, String password);
    void changePassword (String oldPassword,String newPassword);

    //Shopping methods
    void addToCart(Product product);
    void removeFromCart(Product product);
    Bill checkout();
    void writeReview(String review);



}
