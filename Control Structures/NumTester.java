import java.util.Scanner;
class NumTester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Enter an integer:");
        num = scan.nextInt();
        
        //check for positivity or negativity
        if(num < 0)
            System.out.println("Number is negative");
        else
        {
            if(num == 0)
                System.out.println("The number is zero");
            else
                System.out.println("Number is positive!");
        }
    }
}