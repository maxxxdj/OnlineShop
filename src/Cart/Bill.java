package Cart;

import enums.OrderStatus;

import java.util.Date;

public class Bill extends Order {

    private Date datePaid;
    private double sum;

    public Bill(String orderID, Date orderDate, double sum, OrderStatus status) {
        super(orderID, orderDate, sum, status);
    }

    public Date getDatePaid(){
        return this.datePaid;
    }
    public double getSum(){
        return this.sum;
    }

    @Override
    public String toString() {
        return String.format("Your total bill is: %.2f  (%s)",getSum(),getDatePaid().toString());
    }
}
