import java.util.Scanner;
class ReverseNum
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("DJ wale babu mera number bata do:");
        int num = scan.nextInt() , rev;
        rev = getReverse(num);
        System.out.println("Yo Reverse Number is : " + rev);
    }
    
    public static int getReverse(int iNum)
    {
        int rev = 0;
        while(iNum > 0)
        {
            rev = rev * 10 + (iNum%10);
            iNum = iNum / 10;
        }
        return rev;
    }
}