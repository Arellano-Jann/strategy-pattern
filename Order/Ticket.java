package Order;

import Payment.Payment;

public class Ticket implements Order {
    int orderNumber;
    Payment payment;
    Ticket(int sale){
        setPayment(Payment(sale));
    }
    public void setPayment(Payment newPayment){
        this.payment = newPayment;
    }
}
