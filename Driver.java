import Order.Computer;
import Order.Ticket;
import Payment.Card;
import Payment.Cash;

public class Driver {
    public static void main(String[] args){
        Kiosk kiosk = new Kiosk();
        Store store = new Store();
        
        int orderNumber = 5;
        int cashSale = 5;
        int cashPaid = 6;
        Ticket kioskTicket = new Ticket(orderNumber);
        Cash kioskTicketCash = new Cash(cashSale);
        kioskTicket.setPayment(kioskTicketCash);
        kioskTicket.getPayment().pay(cashPaid);
        kiosk.takeOrder(kioskTicket);


        int cardPaid = 5;
        int customerCardNumber = 1000;
        Computer storeComputer = new Computer();
        Card storeComputerCard = new Card(cardPaid);
        storeComputer.setPayment(storeComputerCard);
        storeComputer.getPayment().pay(customerCardNumber);
        store.takeOrder(storeComputer);

        storeComputer.setPayment(kioskTicketCash);
        storeComputer.getPayment().pay(cashPaid);
        store.takeOrder(storeComputer);
    }
}
