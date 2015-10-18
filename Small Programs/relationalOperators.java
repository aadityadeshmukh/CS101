//outcomes:
//Taking input from user
//Relational Operators
import java.util.Scanner;
class relationalOperators
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int sugar,flour;
        
        System.out.println("Flour? :");
        flour = scan.nextInt();
        System.out.println("Sugar? :");
        sugar = scan.nextInt();
        
        if(flour >=4 && sugar >= 2)
            System.out.println("WooHoo! Yo cookies are ready man!");
        else
            System.out.println("Damn!");
    }
}