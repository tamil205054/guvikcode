import java.util.*;
class arrays
{
    public static void main(String ar[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        if(n <= 100000)
        {
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=input.nextInt();
             
        }
        
        Arrays.sort(array);
        for (int i = 0; i < n; i++)  
        { 
              
                if (array[i] < k)  
                    {
                    System.out.printf("%d ",array[i]);
                    }
            
        } 
    
    }
        
    }
}
