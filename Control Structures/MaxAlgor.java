/*
Program to find maximum of the numbers entered by the user
*/
import java.util.Scanner;
class MaxAlgor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("How many integers?");
        num = scan.nextInt();
        int [] arrayNum = new int[num];
        System.out.println("Input values and press enter:");
        for(int i = 0; i < num ; i++){
            System.out.print( "enter an integer: " );
            arrayNum[i] = scan.nextInt();
        }
        int max = arrayNum[0], elem = 0;
        
        for(int i = 0; i < num ; i++)
        {
            if(arrayNum[i] > max){
                max = arrayNum[i];
                elem = i + 1;
            }
        }
        
        System.out.println("Max number is:\t" + max + "and is the\t" + elem + "\t element");
        
        int min = arrayNum[0];
        for(int i : arrayNum)
        {
            if(i < min){
                min = i;
            }
        }
        
        System.out.println("Min number is:\t" + min);
    }
}