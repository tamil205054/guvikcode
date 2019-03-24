import java.util.*;

class Pali
{ 
	public static void expand(String str, int low, int high,Set<String> set)
	{ 
		while (low >= 0 && high < str.length()&& str.charAt(low) == str.charAt(high))
		{ 
			String str2=str.substring(low, high + 1);
			if(str2.length()>1)
			{
			set.add(str2);
			}
			low--;
			high++;
		}
	}
		 static void sort(String []s, int n) 
			{ 
    				for (int i=1 ;i<n; i++) 
    				{ 
        				String temp = s[i]; 
				        int j = i - 1; 
        				while (j >= 0 && temp.length() < s[j].length()) 
        				{ 
            					s[j+1] = s[j]; 
            					j--; 
        				} 
        				s[j+1] = temp; 
    				} 
			} 
  
 
		static void printArraystring(String str[], int n) 
		{ 
    			for (int i=0; i<n; i++)
			{ 
        		System.out.println(str[i]); 
			}
		}
   
		 
  
 
	public static void allPalindromicSubStrings(String str)
	{ 
		Set<String> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++)
		{ 
			expand(str, i, i, set);
			expand(str, i, i + 1, set);
		}
	  	List<String> list = new ArrayList<String>(set); 
        	String Arrstr[]= new String[list.size()];
		for(int i=0;i<list.size();i++)
		{	 	
			Arrstr[i]=list.get(i);
		}
    			sort(Arrstr,Arrstr.length); 
    
    printArraystring(Arrstr, Arrstr.length);
		
	}

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str = input.next();

		allPalindromicSubStrings(str);
	}
}
