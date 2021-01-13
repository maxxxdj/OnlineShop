package Cart;

import enums.OrderStatus;

import java.util.Date;

public class Order {
    private String orderID;
    private Date orderDate;
    private double sum;
    private OrderStatus status;

    protected Order(String orderID, Date orderDate, double sum, OrderStatus status) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.sum = sum;
        this.status = status;
    }

    public void updateOrder(OrderStatus status){
        this.status = status;
    }
}
