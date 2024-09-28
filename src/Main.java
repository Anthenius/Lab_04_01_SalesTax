public class Main
{
    public static void main(String[] args)
    {
       double purchasePrice = 38.42;
       double salesTax;
       final double TAX_RATE = .05;

       salesTax = TAX_RATE * purchasePrice;

       System.out.println("The sales tax on a purchase of " + purchasePrice + " is $" + salesTax);
    }
}