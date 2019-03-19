import java.util.*;
class max
{
  public static void main(String[] args)
  {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      if(n<=100000){
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=scan.nextInt();
      }
	List<Integer> result=new ArrayList<Integer>();

        for(int j=0;j<n-1;j++)
        {
             result.add(Math.max(arr[j],arr[j+1])); 
        }
		for(int j=0;j<result.size();j++)
		{
			System.out.print(result.get(j));
			if(j<result.size()-1)
			{
			System.out.print(" ");	
			}
		}	
        
  }
}
}
