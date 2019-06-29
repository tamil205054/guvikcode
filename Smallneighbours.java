import java.util.*;
public class Smallneighbours
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int k=input.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[n];
    List<Integer>output=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
    	arr1[i]=input.nextInt();
    }
    for(int i=0;i<n;i++)
    {
    	int flag=Math.abs(arr1[i]-k);
    	arr2[i]=flag;
    }
    
    for(int j=0;j<3;j++)
    {
      int min=Integer.MAX_VALUE;
      int index=0;
      for(int i=0;i<n;i++)
      {
        if(arr2[i]!=0&&arr2[i]<min)
        {
          min=arr2[i];
          index=i;
        }
      }
      arr2[index]=Integer.MAX_VALUE;
      output.add(arr1[index]);
    }
    for(int i=0;i<output.size();i++)
    {
    	System.out.print(output.get(i));
    	if(i<output.size()-1)
    	{
    		System.out.print(" ");
    	}
    }
    input.close();
  }
}
