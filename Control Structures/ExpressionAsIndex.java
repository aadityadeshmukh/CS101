/*
The Program illustrates the use of expressions as indices in manipulating
array elements.
In the process I will also learn the declaration, manipulation of data in arrays
*/
class ExpressionAsIndex
{
    public static void main(String[] args)
    {
        int [] arrayNum = new int [5];
        arrayNum [0] = 1;
        arrayNum [1] = 3;
        arrayNum [2] = 8;
        int j = 4;
        System.out.println("The 3rd element is: " + arrayNum [j-2]);
        j++;
        System.out.println("The 5rd element is: " + arrayNum [j-1]);
        j=3;
        arrayNum [j] = arrayNum[j-1] + arrayNum [j-2];
        System.out.println("arrayNum[" + j + "]");
    }
    
    
}