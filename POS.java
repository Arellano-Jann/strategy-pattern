import Order.Order;

public abstract class POS{
    Order order;
    public void takeOrder(Order newOrder){
        this.order = newOrder;
    }
}