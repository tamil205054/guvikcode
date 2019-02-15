import java.util.*;
class arrays
{
    public static void main(String ar[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
         
        int arr[]=new int[n];
        int array[]=new int[n];
        HashSet<Integer> numbers = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
             
        }
        for(int i=0;i<n;i++)
        {
            array[i]=input.nextInt();
             
        }
        
        Arrays.sort(arr);
        Arrays.sort(array);
        for (int i = 0; i < n; i++)  
        { 
            for(int j=0;j<n;j++)
            {  
                if (arr[i] == array[j])  
                    {
                    numbers.add(arr[i]);
                    } 
            }
        } 
        Iterator<Integer> i=numbers.iterator();  
        while(i.hasNext())  
        {  
        System.out.print(i.next());
        int j=0;
        if(j<numbers.size()-1)
        {
            System.out.print(" ");
            j++;
        }  
        }
    
        
    }
}
