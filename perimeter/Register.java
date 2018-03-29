public class Register {
    private double purchase;
    private double payment;
    private double tax;
    public Register()
    {
    }
    public Register(double tax)
    {
        this.tax = tax;
    }

    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }
    public void enterPayment(double amount)
    {
        payment = amount;
    }

    public void recordTaxablePurchase()
    {
        purchase = purchase  + (purchase *(tax/100));
    }
    public double getTotalTax()
    {
        return (purchase*0.10);
    }
    public void getSalesTotal()
    {

    }
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;  
    }

}