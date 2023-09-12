import Order.Computer;

public class Store extends POS {
    Computer[] computerOrders = new Computer[5];
    int curr = 0;
    // public Kiosk(){
    // }
    public void takeOrder(Computer newOrder){
        this.computerOrders[curr] = newOrder;
        curr = (curr + 1) % 5;
    }
}
