import java.util.*; 
class SegmentTree 
{ 
	int st[]; 	
	SegmentTree(int arr[], int n) 
	{ 
		int x = (int) (Math.ceil(Math.log(n) / Math.log(2))); 
		int max_size = 2 * (int) Math.pow(2, x) - 1; 
		st = new int[max_size];
		constructSTUtil(arr, 0, n - 1, 0); 
	} 
	int getMid(int s, int e) 
	{ 
		return s + (e - s) / 2; 
	} 
	int getSumUtil(int ss, int se, int qs, int qe, int si) 
	{ 
		if (qs <= ss && qe >= se)
		{			
			return st[si]; 
		}
		if (se < qs || ss > qe)
		{			
			return 0; 
		}
		int mid = getMid(ss, se); 
		return getSumUtil(ss, mid, qs, qe, 2 * si + 1) +getSumUtil(mid + 1, se, qs, qe, 2 * si + 2); 
	} 

  
 
	int getSum(int n, int qs, int qe) 
	{   
	/*	if (qs < 0 || qe > n - 1 || qs > qe) 
		{ 
			System.out.println("Invalid Input"); 
			return -1; 
		}
*/		
		return getSumUtil(0, n - 1, qs, qe, 0); 
	} 
 
	int constructSTUtil(int arr[], int ss, int se, int si) 
	{ 
	 
		if (ss == se) 
		{ 
			st[si] = arr[ss]; 
			return arr[ss]; 
		} 
 
		int mid = getMid(ss, se); 
		st[si] = constructSTUtil(arr, ss, mid, si * 2 + 1) + constructSTUtil(arr, mid + 1, se, si * 2 + 2); 
		return st[si]; 
	} 

	  
	public static void main(String args[]) 
	{ 
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		int k=input.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++)
		{
		 arr[i]=input.nextInt();	
		}
		List<Integer> result=new ArrayList<Integer>();
		SegmentTree tree = new SegmentTree(arr, n); 
		for(int i=0;i<k;i++)
		{
			int u=input.nextInt();
			int v=input.nextInt();
		 result.add(tree.getSum(n, u-1, v-1));	
		}
						 
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
	 
	} 
} 
 
