import java.util.*;
class findnum { 
      
    static int number(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
        { 
            int j; 
            for (j = 0; j < n; j++) 
                if (i != j && arr[i] == arr[j]) 
                    break; 
            if (j == n) 
                return arr[i]; 
        } 
          
        return -1; 
    } 
    public static void main (String[] args) 
    { 
      Scanner ip=new Scanner(System.in);
      int n=ip.nextInt();    
        int arr[] =new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=ip.nextInt();
       }
          
        System.out.print(number(arr, n)); 
    } 
} 
