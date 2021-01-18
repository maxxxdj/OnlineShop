package Cart;

import enums.OrderStatus;

import java.util.Date;

public class Bill extends Order {

    private Date datePaid;
    private double sum;



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

    public void addToBill(double sum) {
        this.sum += sum;

    }
    public void removeFromBill(double sum) {
        this.sum -= sum;

    }
}
