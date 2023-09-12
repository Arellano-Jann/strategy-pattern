package Order;
import java.util.Random;

import Payment.Payment;

public class Computer implements Order {
    int orderNumber;
    Payment payment;
    public Computer(){
        generateOrderNumber();
    }
    public void generateOrderNumber(){
        Random rand = new Random();
        orderNumber = rand.nextInt(1000);
        System.out.println("Order #: " + orderNumber);
    }
    public void setPayment(Payment newPayment){
        this.payment = newPayment;
    }
    public Payment getPayment(){ return this.payment; }
}
