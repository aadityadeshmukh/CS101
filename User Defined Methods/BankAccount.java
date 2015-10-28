//program to demonstrate the use of user defined methods
//emphasis on formal and actual parameters, local variable etc...
import java.util.Scanner;
class BankAccount
{
    static double Balance;
    public BankAccount(double Amount)
    {
        Balance = Amount;
    }
    public double getInterest(double numYrs)
    {
        Balance += (Balance * numYrs * 10.5) / 100.0;
        return Balance;
    }
    public double getBankRent(double numYrs)
    {
        Balance -= ( numYrs * 0.5 * Balance) / 100.0;
        return Balance;
    }
    public static void main(String [] args)
    {
        double BankBalance = 0.0, initBalance = 0.0;
        System.out.println("Enter the initial ammount Ashley:");
        Scanner scan = new Scanner(System.in);
        initBalance = scan.nextDouble();
        BankAccount ashleyAC;
        ashleyAC = new BankAccount(initBalance);
        System.out.println("Initial Balance :" + ashleyAC.Balance);
        System.out.println("Enter the number of years Ashley:");
        double years = scan.nextDouble();
        BankBalance = ashleyAC.getInterest(years);
        System.out.println("Balance after " + years + " years will be " + BankBalance);
        BankBalance = ashleyAC.getBankRent(years);
        System.out.println("However after cutting bank fees the ammount will be " + BankBalance);
    }
}
    