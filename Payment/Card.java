package Payment;
public class Card implements Payment{
    int saleAmt, cardNumber;

    public Card(int sale){
        this.saleAmt = sale;
        System.out.println("Sale: " + saleAmt);
    }
    public void pay(int customerCardNumber){
        this.cardNumber = customerCardNumber;
        System.out.println("Card: " + customerCardNumber);
    }
    

    // public int getSale(){
    //     return this.saleAmt;
    //     // System.out.println("This was the sale: " + saleAmt);
    // }
    // public void takePayment(int customerCardNumber){
    //     this.cardNumber = customerCardNumber;
    // }
}
