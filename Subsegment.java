import java.util.*;

public class Subsegment {
  
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int m=input.nextInt();
    
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=input.nextInt();
    }
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<n;i++)
    {
      if(min>arr[i])
      {
        min=arr[i];
      }
     if(max<arr[i])
     {
       max=arr[i];
     }
    }
    if(m==1)
    {
      System.out.print(min);
    }
    else if(m==2)
    {
    System.out.print(Math.max(arr[0],arr[arr.length-1]));
    } 
    else
    {
       System.out.print(max);
    }
    input.close();
  }
}
