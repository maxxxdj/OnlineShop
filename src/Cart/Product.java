package Cart;

import UserPackage.User;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Product extends Item{
    private int id;
    private int idCounter;
    private String description;
    private String manufacturer;

    public Product(int quantity, double price,String description, String manufacturer) {
        super(quantity, price);
        this.setId();
        this.description = description;
        this.manufacturer = manufacturer;

    }

    private void setId(){
        this.id = idCounter++;
    }
}
