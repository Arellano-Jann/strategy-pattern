package Order;

import Payment.Payment;

public class Ticket implements Order {
    int orderNumber;
    Payment payment;
    public Ticket(int newOrderNumber){
        this.orderNumber = newOrderNumber;
        System.out.println("Order #: " + orderNumber);
    }
    public void setPayment(Payment newPayment){
        this.payment = newPayment;
    }
    public Payment getPayment(){ return this.payment; }
}
