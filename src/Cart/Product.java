package Cart;

import UserPackage.User;
import enums.ProductType;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Product{
    private int id;
    private int idCounter;
    private ProductType type;
    private double price;
    private String description;
    private String manufacturer;

    public Product(ProductType type, double price, String description, String manufacturer) {
        this.setId();
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
    }

    private void setId(){
        this.id = idCounter++;
    }
    public double getPrice() {
        return price;
    }
}
