//program to check the correct answer to a mutiple choice question
import java.util.Scanner;
class MultipleChoice
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String LineIN;
        char choice;
        
        //Pipe the question
        System.out.println("What is the capital of Russia?");
        System.out.println("A. St. Petersberg \t B. Yo Yo Honey Singh \n C. Moscow \t D. Nevermore");
        
        LineIN = scan.nextLine();
        choice = LineIN.charAt(0);
        
        switch(choice)
        {
            case 'A':
            case 'a':
                System.out.println("Close but Wrong answer!");
                break;
            case 'B':
            case 'b':
                System.out.println("Really thats your answer?");
                break;
            case 'C':
            case 'c':
                System.out.println("Bang On buddy!");
                break;
            case 'D':
            case 'd':
                System.out.println("Dumb as a sloth!");
                break;
            default:
                System.out.println("Think you are a daredevil? \n Guess what its not even an option");
        } 
        System.out.println("Thanks for taking the test!");
    }
}