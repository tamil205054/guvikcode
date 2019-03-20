 
import java.util.*;

 class permutation{ 

	 
	static void printArrayList(ArrayList<String> arrL) 
	{ 
	Set<String> hs=new HashSet<String>();
		arrL.remove(""); 
		for (int i = 0; i < arrL.size(); i++)
		{
			if(hs.add(arrL.get(i)))
			{
				System.out.println(arrL.get(i));
			}
		}
	}  
	public static ArrayList<String> getPermutation(String str) 
	{ 
		if (str.length() == 0) 
		{  
			ArrayList<String> empty = new ArrayList<>(); 
			empty.add(""); 
			return empty; 
		} 
		char ch = str.charAt(0); 
		String subStr = str.substring(1); 
		ArrayList<String> prevResult = getPermutation(subStr); 
		ArrayList<String> Res = new ArrayList<>(); 
		for (String val : prevResult) 
		{ 
			for (int i = 0; i <= val.length(); i++) 
			{ 
				Res.add(val.substring(0, i) + ch + val.substring(i)); 
			} 
		}  
		return Res; 
	} 
  
	public static void main(String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		String str =input.next(); 
		printArrayList(getPermutation(str)); 
		input.close();
	} 
} 
