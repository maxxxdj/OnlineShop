package Containers;

import Cart.Bill;
import Cart.Product;

public interface ShoppingInterface {


    void addToCart(Product product);

    void removeFromCart(Product product);
    Bill checkout();
}
