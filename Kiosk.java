import Order.Ticket;

public class Kiosk extends POS {
    Ticket[] tickets = new Ticket[5];
    int curr = 0;
    // public Kiosk(){
    // }
    public void takeOrder(Ticket newOrder){
        this.tickets[curr] = newOrder;
        curr = (curr + 1) % 5;
    }
}
