//Program to pipe out a factorial of the nuber input by none other than dumbass Yo-Yo
import java.util.Scanner;
class SentinelFactorial
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long num,fact;        
        System.out.println("Mainu ye number da factorial batala do pappe:");
        num = scan.nextInt();
        if(num == 0 || num > 20){
            System.out.print("O jee bahot unchi heel hai tvaddi!");
            return;
        }
        
        fact = getFactorial(num);
        System.out.print(num + "! = " + fact);
    }
    
    public static long getFactorial(long iNum)
    {
        long ofact = 1;
        for(;iNum >=1 ; iNum--)
            ofact = ofact * iNum;
        
        return ofact;
    }
}