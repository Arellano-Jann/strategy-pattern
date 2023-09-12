package Payment;
public class Cash implements Payment{
    int saleAmt, changeAmt;

    public Cash(int sale){
        this.saleAmt = sale;
        System.out.println("Sale: " + saleAmt);
    }
    public void pay(int paymentAmt){
        this.changeAmt = paymentAmt - saleAmt;
        System.out.println("Change: " + changeAmt);
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
