package UserPackage;

import Cart.Bill;
import Cart.Product;
import Containers.ReviewsContainer;
import Containers.ShoppingCart;
import enums.AccountStatus;

public class User implements UserInterface {
    private String username;
    private String password;
    private Address address;
    private String phone;
    private String name;
    private String lastName;
    private String email;
    private AccountStatus status;
    private ShoppingCart cart;


    protected User() {
        this.address = new AddressBuilder();
        this.cart = new ShoppingCart();
    }

    //Getters & Setters

    public String getUsername() {
        return username;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    public AccountStatus getStatus() {
        return status;
    }

    protected void setStatus(AccountStatus status) {
        this.status = status;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    //Functional Methods
    @Override
    public void changeUsername(String username, String password) {
        if (password.equals(this.password)) {
            this.username = username;
        }
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(this.password)) {
            this.password = password;
        }
    }

    //Shopping methods

    @Override
    public void addToCart(Product product) {
        this.cart.addProductToCart(product);
    }
    public void addToCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.cart.addProductToCart(product);
        }
    }

    @Override
    public void removeFromCart(Product product) {
        this.cart.removeProductFromCart(product);
    }

    public void removeFromCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.cart.removeProductFromCart(product);
        }
    }

    @Override
    public Bill checkout() {
        return cart.checkout();
    }

    @Override
    public void writeReview(String review) {
        ReviewsContainer.addReview(this, review);
    }
}
