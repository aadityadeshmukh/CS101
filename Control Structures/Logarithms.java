//Program to print logarithms of some loating point values
//Illustration of a for loop and the MATH.LOG function
class Logarithms
{
    public static void main(String[] args)
    {
        System.out.println("Number \t" + "Logarithm");
        int totalCount = 20;
        for(int i=1;i<=totalCount;i++)
        {
            double num = i/10.0;
            System.out.println(num + "\t" + Math.log(num));
        }
    }
}