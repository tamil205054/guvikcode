import java.util.*;
class Longest
{  
	static void printSubStr(String str, int low, int high) 
	{ 
		System.out.println(str.substring(low, high + 1)); 
	} 
 
	static int longestPalSubstr(String str) { 
		int maxLength = 1;   

		int start = 0; 
		int len = str.length(); 

		int low, high; 
 
		for (int i = 1; i < len; ++i) 
		{   
			low = i - 1; 
			high = i; 
			while (low >= 0 && high < len 
					&& str.charAt(low) == str.charAt(high)) { 
				if (high - low + 1 > maxLength) { 
					start = low; 
					maxLength = high - low + 1; 
				} 
				--low; 
				++high; 
			} 
 
			low = i - 1; 
			high = i + 1; 
			while (low >= 0 && high < len 
					&& str.charAt(low) == str.charAt(high)) { 
				if (high - low + 1 > maxLength) { 
					start = low; 
					maxLength = high - low + 1; 
				} 
				--low; 
				++high; 
			} 
		} 
 
		return maxLength; 
	} 
 
	public static void main(String[] args) { 
		Scanner input=new Scanner(System.in);
		String str = input.next(); 
		System.out.println(longestPalSubstr(str)); 
		input.close();
	} 

}  
