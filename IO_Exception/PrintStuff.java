//Program to demonstrate the printf statement
//Basic IO i java
import java.util.Scanner;
class PrintStuff
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in); //The Scanner constructor takes standard input as an argument
        String strs = scan.nextLine();
        System.out.printf("%s is what is input\n",strs);
        int argsss = scan.nextInt();
        System.out.printf("%d is what is input after %s\n", argsss, strs);
    }
}