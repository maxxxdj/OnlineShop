package Containers;

import Cart.Bill;
import Cart.Product;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    private Set<Product> cart;
    private Bill bill;

    public ShoppingCart() {
        this.cart = new HashSet<>();
        this.bill = new Bill();
    }


    public void addProductToCart(Product product) {
        cart.add(product);
        bill.addToBill(product.getPrice());
    }

    public void removeProductFromCart(Product product) {
        this.cart.remove(product);
        bill.removeFromBill(product.getPrice());
    }

    public Bill checkout() {
        return this.bill;
    }
}
