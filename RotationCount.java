import java.util.*;

public class RotationCount
{
  
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[n];
    int flag,count=0;
    for(int i=0;i<n;i++)
    {
      arr1[i]=input.nextInt();
    }
    
    for(int i=0;i<n;i++)
    {
      arr2[i]=input.nextInt();
    }
     flag=arr1[0];
    for(int i=n-1;i>=0;i--){
     	count++;
      if(flag==arr2[i]){
        System.out.print(count);
        break;
      }
    }
    

  input.close();    
  }
}
