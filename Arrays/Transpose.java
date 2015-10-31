//Program to illustrate the transpose of a randomly generated array 
//without the use of a 2nd array
import java.util.Random;
import java.util.Scanner;
class Transpose
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of rows and columns:");
        int rows = scan.nextInt();
        int [][]Arr = new int [rows][rows];
        
        for(int i = 0; i < Arr.length ; i++ )
            for(int j = 0; j < Arr[i].length; j++ )
                Arr[i][j] = rand.nextInt(100);
        
        System.out.println("Input Array is:");
        nowPrint(Arr);
        
        for(int i = 0; i < Arr.length ; i++ )
        {
            for(int j = 0; j < Arr[i].length; j++ )
            {
                if(i != j)
                {
                    if(i<j)
                    {
                        Arr[i][j] = Arr[i][j] + Arr[j][i];
                        Arr[j][i] = Arr[i][j] - Arr[j][i];
                        Arr[i][j] = Arr[i][j] - Arr[j][i];
                    }
                }
            }
        }
        
        System.out.println("Transposed Array is:");
        nowPrint(Arr);
    }
    public static void nowPrint(int [][] Array)
    {
        for(int i = 0; i < Array.length ; i++ )
        {
            for(int j = 0; j < Array[i].length; j++ )
                System.out.print(Array[i][j] + "\t");
            
            System.out.println();
        }
    }
}
