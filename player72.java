import java.util.*;
class arrays
{
    public static void main(String ar[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=input.nextInt();
             
        }
        Arrays.sort(array);
        System.out.printf("%d",array[n-1]);
          
    
        
    }
}
