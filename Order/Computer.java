package Order;
import java.util.Random;

public class Computer implements Order {
    int orderNumber;
    Payment payment;
    Computer(int sale){
        setPayment(Payment(sale))
    }
    public void generateOrderNumber(){
        Random rand = new Random();
        orderNumber = rand.nextInt(1000);
    }
    public void setPayment(Payment newPayment){
        this.payment = newPayment;
    }
}
