package Payment;
public class Cash implements Payment{
    int saleAmt, changeAmt;

    public Cash(int sale){
        this.saleAmt = sale;
    }
    public void pay(int paymentAmt){
        this.changeAmt = saleAmt - paymentAmt;
    }

    // public int getSale(){
    //     return this.saleAmt;
    //     // System.out.println("This was the sale: " + saleAmt);
    // }
    // public void takePayment(int amt){
    //     changeAmt = saleAmt - paymentAmt;
    //     System.out.println("Here's ur change: $" + changeAmt);
    // }
}
