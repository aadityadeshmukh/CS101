//program to write out a sum of all the numbers. even numbers and odd numbers
//between 1 and user input
//illustrates the use of Nested loops
import java.util.Scanner;
class SumAll
{
    public static void main(String [] args)
    {
     Scanner scan = new Scanner(System.in);
     int userinp, sum = 0, oddsum = 0, evensum = 0;
     System.out.println("Enter the number biatch:");
     userinp = scan.nextInt();
     if(userinp <= 0)
         return;
     
     for(int i = 1; i<= userinp ; i++)
     {
         sum = sum + i;
         if(i%2 == 0)
             evensum = evensum + i;
         else
             oddsum = oddsum + i;
     }
     
     System.out.println("The Sum is " + sum);
     System.out.println("The even sum is " + evensum);
     System.out.println("The odd sum is " + oddsum);
    }    
}