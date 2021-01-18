package UserPackage;

import Cart.Product;

public class Client extends User {



    public Client() {
    }

    //Shopping
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

