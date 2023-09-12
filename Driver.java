import Order.Computer;
import Order.Ticket;
import Payment.Card;
import Payment.Cash;

public class Driver {
    public static void main(String[] args){
        Kiosk kiosk = new Kiosk();
        Store store = new Store();
        
        int orderNumber = 5;
        int cashPaid = 5;
        Ticket kioskTicket = new Ticket(orderNumber);
        Cash kioskTicketCash = new Cash(cashPaid);
        kioskTicket.setPayment(kioskTicketCash);
        kiosk.takeOrder(kioskTicket);


        int cardPaid = 5;
        Computer storeComputer = new Computer();
        Card storeComputerCard = new Card(cardPaid);
        storeComputer.setPayment(storeComputerCard);
        store.takeOrder(storeComputer);

        storeComputer.setPayment(kioskTicketCash);
        store.takeOrder(storeComputer);
    }
}
