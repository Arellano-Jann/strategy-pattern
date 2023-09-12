package Order;

import Payment.Payment;

public class Ticket implements Order {
    int orderNumber;
    Payment payment;
    public Ticket(int newOrderNumber){
        this.orderNumber = newOrderNumber;
    }
    public void setPayment(Payment newPayment){
        this.payment = newPayment;
    }
}
