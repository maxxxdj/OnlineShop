package UserPackage;

import Cart.Bill;
import Cart.Product;
import Containers.ShoppingCart;
import Containers.ShoppingInterface;

public class Client extends User implements ShoppingInterface {

    private Address address;
    private String phone;
    private ShoppingCart cart;

    public Client() {
        this.cart = new ShoppingCart();
    }


    //User Methods
    @Override
    public void changePassword(String oldPassword, String newPassword) {
        if(oldPassword.equals(super.getPassword())) {
            super.changePassword(newPassword);
        }
    }

    @Override
    public void changeUsername(String password,String username) {
        if (password.equals(super.getPassword())) {
            super.changeUsername(username);
        }
    }


    //Getters and setters

    public String getUsername(){
        return super.getUsername();
    }


    public String getPhone() {
        return this.phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    protected void setAddress(Address address) {
        this.address = address;
    }


    //Shopping methods
    @Override
    public void addToCart(Product product) {
        cart.addToCart(product);

    }
    public void addToCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            cart.addToCart(product);
        }
    }

    @Override
    public void removeFromCart(Product product) {
        cart.removeFromCart(product);
    }
    public void removeFromCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            cart.removeFromCart(product);
        }
    }

    @Override
    public Bill checkout() {
        return cart.checkout();
    }


}

