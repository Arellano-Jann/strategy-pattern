package Order;
public class Computer implements Order {
    int orderNumber;
    Payment payment;
    Computer(int sale){
        setPayment(Payment(sale))
    }
    public void generateOrderNumber(){

    }
    public void setPayment(Payment newPayment){
        this.payment = newPayment;
    }
}
