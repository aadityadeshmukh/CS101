import java.io.*;
import java.util.*;
class Exceptions
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int yo=0;
        boolean dataGood = false;
        while (!dataGood) {
            try {
                System.out.println("Enter a number:");
                yo = scan.nextInt();
                dataGood = true;
            } catch (InputMismatchException iox) {
                System.out.println("You probably entered a wrong input!");
                String flush = scan.next();
            } finally {
                System.out.println("Enter a number dude");
            }
        }
        System.out.println("What a day inputting numbers!");
    }
}