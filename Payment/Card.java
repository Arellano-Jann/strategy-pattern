package Payment;
public class Card implements Payment{
    int saleAmt, cardNumber;

    Card(int sale){
        this.saleAmt = sale;
    }
    public void pay(int customerCardNumber){
        this.cardNumber = customerCardNumber;
    }

    // public void getSale(int amt){
    //     this.saleAmt = amt;
    //     System.out.println("This was the sale: " + saleAmt);
    // }
    // public void takePayment(int customerCardNumber){
    //     this.cardNumber = customerCardNumber;
    // }
}
