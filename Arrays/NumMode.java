//Program for finding out a mode of data input
import java.util.Random;
import java.util.Scanner;
class NumMode
{
    public static void main(String[] args)
    {
        Random randGen;
        randGen = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num = scan.nextInt();
        int[] Arr;
        Arr = new int [num];
        for(int i = 0; i < Arr.length ; i++ )
            Arr[i] = randGen.nextInt(100);
        
        //Find the number appearing maximum times
        int maxVal = 0, maxCount = 0;
        for(int i = 0 ; i < Arr.length ; i++)
        {
            int count = 0;
            for(int j = 0; j< Arr.length ; j++)
            {
                if(Arr[j] == Arr[i])
                    count++;
            }
            
            if(count > maxCount)
            {
                maxVal = Arr[i];
                maxCount = count;
            }
        }
        
        //Print out the results
        System.out.println("The mode of the group is " + maxVal + " appearing " + maxCount + " times.");
    }
}