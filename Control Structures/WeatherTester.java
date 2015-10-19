//Simple control structure
import java.util.Scanner;
class WeatherTester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String rains;
        System.out.println("Is it raining? (Y or N) :");
        rains = scan.nextLine();
        
        if(rains.equals("Y"))
            System.out.println("Well wipers ON buddy!");
        else
            System.out.println("Aww Man no rains!");
    }
}