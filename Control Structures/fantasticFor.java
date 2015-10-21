//Simple program to demonstrate the use of a for loop
class fantasticFor
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 30 ; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}