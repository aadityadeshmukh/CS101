/*Program to tabulate the distance travelled by Yo-Yo Honey Singhs brain
    if it falls for a user defined time.
    Ahh Who are we kidding his brain (if it exists) always go higher
*/
import java.util.Scanner;
class GravityProblem
{
    public static void main(String [] args)
    {
        int totTime;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time of Brainfall:");
        totTime = scan.nextInt();
        System.out.println("Time (s)" + "\t" + "Distance (m)");
        for(int i = 0 ; i <= totTime ; i++)
        {
           double distance = 9.81 * i * i * (1/2.0);
           System.out.println(i + "\t" + distance);
        }
    }
}