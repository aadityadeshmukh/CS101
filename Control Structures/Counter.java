//simple program to illustrate the while loop
class Counter
{
    public static void main(String [] args)
    {
        int yoyo = 384;
        int num = 1; // initializing the loop control variable
        while(num <= yoyo) // loop control test
        {
            if(num % 2 == 1) //condition check
                System.out.println(num); 
            
            num += 1;
        }
    }
}