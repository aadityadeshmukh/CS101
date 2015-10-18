//Program to write out area of some pre input data
//Does not take input from user. Although it should by this time
class AreaOfCircle
{
    public static void main(String[] args)
    {
        int radius = 2;
        double area;
        System.out.println("Areas of pre input values are:");
        for(int i=1;i<=4;i++)
        {
            area = 3.14 * radius * radius;
            System.out.println(area);
            radius++;
        }
    }
}