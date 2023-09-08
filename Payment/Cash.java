package Payment;
public class Cash implements Payment{
    int saleAmt, paymentAmt, changeAmt;

    public void getSale(int amt){
        this.saleAmt = amt;
        System.out.println("This was the sale: " + saleAmt);
    }
    public void takePayment(int amt){
        changeAmt = saleAmt - paymentAmt;
        System.out.println("Here's ur change: $" + changeAmt);
    }
}
