package enums;

import Cart.Product;

public enum ProductType {
    HAIRDRYER("Hairdryer"),
    HEADPHONES("Headphones"),
    LAPTOP("Laptop"),
    CHARGER("Charger");

    private String name;
    ProductType(String name){
        this.name = name;
    }

}
