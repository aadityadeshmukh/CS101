//Program to demonstrate a Sentenial conrol loop using do while
//A do while is a bad choice for a counter loop but works best when user interaction is involved
//In this program Yo-Yo Honey Singh gets to find what squares of numbers are
import java.util.Scanner;
class SentenialControl
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        double num;
        String flush;
        
        do
        {
            System.out.println("O Jee Mainu is number da square janna chahida");
            num = scan.nextDouble();
            flush = scan.nextLine();
            System.out.println("Kya baat hai tussi toh vadde hoshiyar vich ho:" + num*num);
            System.out.println("Aur ek bottle chadhan de? [Han ya na}");
            flush = scan.nextLine();
        }while(flush.equals("H")|| flush.equals("h") || flush.equals("Han") || flush.equals("han"));
    }
}
