package Containers;

import Cart.Bill;
import Cart.Product;
import java.util.HashSet;
import java.util.Set;

public class ShoppingCart implements ShoppingInterface {
    private Set<Product> cart;
    private Bill bill;

    public ShoppingCart(){
        this.cart = new HashSet<>();
        this.bill=new Bill();
    }


    @Override
    public void addToCart(Product product) {
            cart.add(product);
            bill.addToBill(product.getPrice());
    }

    @Override
    public void removeFromCart(Product product) {
            this.cart.remove(product);
            bill.removeFromBill(product.getPrice());
        }


    @Override
    public Bill checkout() {
        return this.bill;
    }
}
