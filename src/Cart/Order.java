package Cart;

import enums.OrderStatus;

import java.util.Calendar;
import java.util.Date;

public class Order {
    private int orderID;
    private Date orderDate;
    private OrderStatus orderStatus;

    protected Order() {
        this.setOrderID();
        this.setOrderDate();
    }

    public int getOrderID() {
        return this.orderID;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public OrderStatus getOrderStatus() {
        return this.orderStatus;
    }
    protected void setOrderID() {
        this.orderID = this.orderID++;
    }

    protected void setOrderDate() {
        this.orderDate = Calendar.getInstance().getTime();
    }

    public void setStatus(OrderStatus status) {
        this.orderStatus = status;
    }
}
