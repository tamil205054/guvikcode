    
import java.util.*;

public class ReachedDistence{
  
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int m=input.nextInt();
    int arr[][]=new int[n][2];
    for(int i=0;i<n;i++)
    {
      arr[i][0]=input.nextInt();
      arr[i][1]=input.nextInt();  
    }
    boolean output=false;
    for(int i=0;i<n;i++)
    {
      if(arr[i][0]<=m&&m<=arr[i][1])
      {
        output=true;    
      }
    }
    if(output)
    {
      System.out.print("yes");
    }
    else
    {
      System.out.print("no");
    }
    input.close();
  }
}
