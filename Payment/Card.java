package Payment;
public class Card implements Payment{
    int saleAmt, cardNumber;

    public Card(int sale){
        this.saleAmt = sale;
    }
    public void pay(int customerCardNumber){
        this.cardNumber = customerCardNumber;
    }

    // public int getSale(){
    //     return this.saleAmt;
    //     // System.out.println("This was the sale: " + saleAmt);
    // }
    // public void takePayment(int customerCardNumber){
    //     this.cardNumber = customerCardNumber;
    // }
}
