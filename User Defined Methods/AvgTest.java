//Program to demonstrate user defined methods
//Evaluation of average of 3 numbers and finding the max
class AvgTest
{
    public static void main(String [] args)
    {
       int r1 = 10,r2 = 17 ,r3 = 55;
       int x1 = 59,x2 = -3,x3 = 85;
       double avg = getAverage(r1, r2 , r3);
       System.out.println("Average 1 : " + avg);
       avg = getAverage(x1, x2 , x3);
       System.out.println("Average 2 : " + avg);
       
       int max = getMax(r1, r2 , r3);
       System.out.println("Max 1 :" + max);
       max = getMax(x1, x2 , x3);
       System.out.println("Max 2 :" + max);
    }
    
    public static double getAverage(int y1 , int y2 , int y3)
    {
        return ((y1 + y2 + y3) / 3);
    }
    
    public static int getMax(int y1 , int y2 , int y3)
    {
        int oMax = y1;
        if(y2 > oMax)
            oMax = y2;
        
        if(y3 > oMax)
            oMax = y3;
        return oMax;
    }
}