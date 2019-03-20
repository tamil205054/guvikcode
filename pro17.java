 import java.util.*;
 class children {
	  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int arr[] = new int[n]; 
    for(int j=0;j<n;j++)
    {
      arr[j] = s.nextInt();
    }
    boolean flag = false;
    for(int b=0;b<n;b++)
    {
      for(int c=0;c<n;c++)
      {
      if(arr[b] + arr[c] == k)
      {
        flag = true;
      }
      }
    }
	if(flag)
	{
		System.out.println("yes");
	}
	else
	{
    System.out.println("no");
	}
  }
 }
