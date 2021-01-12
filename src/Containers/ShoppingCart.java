package Containers;


import Cart.Product;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    private Set<Product> cart;

    public ShoppingCart(){
        this.cart = new HashSet<>();
    }

    public void addToCart(Product product, int quantity){
        for (int i = 0; i < quantity; i++) {
            cart.add(product);
        }
    }
    public void removeFromCart(Product product){
     cart.remove(product);
    }

}
