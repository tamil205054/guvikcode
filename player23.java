import java.util.*;
class array{
    public static void main(String arg[])
    {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int ArrayofNumber[]=new int[n];
        int insert=input.nextInt();
        for(int i=0;i<n;i++)
        {
            ArrayofNumber[i]=input.nextInt();
        }
        Arrays.sort(ArrayofNumber);
        for(int i=0;i<insert;i++)
        { 
            ArrayofNumber[i]=input.nextInt();
        }
        Arrays.sort(ArrayofNumber);
        for(int i=n-insert;i<n;i++)
        {
            System.out.printf("%d ",ArrayofNumber[i]);
        }
    }
} 
