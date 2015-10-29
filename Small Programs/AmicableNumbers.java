//Program to demonstrate amicable number check
//Amicable numbers are the ones whose sum of divisors is equal to the 2nd number.
import java.util.Scanner;
class AmicableNumbers
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 0,sum1 = 0, sum2 = 0;
        System.out.println("Enter the 1st number:");
        num1 = scan.nextInt();
        System.out.println("Enter the 2nd number:");
        num2 = scan.nextInt();
        
        //Run the divisor check for 1st number
        for(int i = 1; i < num1; i++)
        {
            if(num1 % i == 0)
                sum1 += i;
        }
        //Run the divisor check for 1st number
        for (int i = 1; i < num2 ; i++)
        {
            if(num2 % i == 0)
                sum2 += i;
        }
        
        if(num1 == sum2 && num2 == sum1)
            System.out.println("Voila the numbers are amicable!");
        else
            System.out.println("No they dont tie friendship bands on friendship day!");
    }
}