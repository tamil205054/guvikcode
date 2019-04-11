import java.util.*; 
class maxwell { 
  
	static int gcd(int a, int b) 
	{ 
		if (a == 0) 
			return b; 
		return gcd(b % a, a); 
	} 
	public static void main(String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int q=input.nextInt();
		int arr[]=new int[n];
		List<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<q;i++)
		{
			int l=input.nextInt()-1;
			int r=input.nextInt();
			int result=arr[l];
				for(int j=l;j<r;j++)
				{
					result =gcd(arr[j],result);
				}
				ans.add(result);
		} 
		for(int s:ans)
		{
			System.out.println(s);
		}
		input.close();
	} 
} 
 
 
