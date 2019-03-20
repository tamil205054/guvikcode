  import java.util.*;
class longsubchar
{ 
	
	static final int NO_OF_CHARS = 256; 
	
	static int longestUniqueSubsttr(String str) 
	{ 
		int n = str.length(); 
		int cur_len = 1;  
		int max_len = 1; 
		int prev_index;	 
		int i; 
		int visited[] = new int[NO_OF_CHARS]; 
		
		for (i = 0; i < NO_OF_CHARS; i++) { 
			visited[i] = -1; 
		} 
		 
		visited[str.charAt(0)] = 0; 
		 
		for(i = 1; i < n; i++) 
		{ 
			prev_index = visited[str.charAt(i)]; 
			 
			if(prev_index == -1 || i - cur_len > prev_index) 
				cur_len++; 
			 
			else
			{  
				if(cur_len > max_len) 
					max_len = cur_len; 
				
				cur_len = i - prev_index; 
			} 
			 
			visited[str.charAt(i)] = i; 
		} 
		 
		if(cur_len > max_len) 
			max_len = cur_len; 
		
		return max_len; 
	} 
	 
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String str = input.next(); 
		int len = longestUniqueSubsttr(str); 
		System.out.println(len); 
	} 
} 
 
