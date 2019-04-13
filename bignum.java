import java.util.*; 
class bignumber {
    HashSet<Integer> result=new HashSet<Integer>();
   public  void permute(String str, int l, int r) 
	{ 
        if (l == r) 
        { 
            result.add(Integer.parseInt(str));
        }
        else { 
			for (int i = l; i <= r; i++) { 
				str = swap(str, l, i); 
				permute(str, l + 1, r); 
				str = swap(str, l, i); 
			} 
        }  
        
	} 
	static String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i]; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 
	public static void main(String[] args) 
	{ 
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
		String str = Integer.toString(num); 
        int n = str.length();  
        bignumber obj=new bignumber();
        obj.permute(str, 0, n - 1);
        ArrayList<Integer> ans=new ArrayList<>(obj.result);
        Collections.sort(ans);
        int answer=0;
        for (int a : ans) 
        {
            if(num<a)
            {
                answer=a;
                break;
            }    
        }
        if(answer==0)
        {
            System.out.println("impossible");
        }
        else
        {
        System.out.println(answer);
        }
	} 

	
	 
} 
