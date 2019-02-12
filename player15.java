import java.util.*;
  class GFG  
{ 
      
  
    public static void main(String[] args) 
    { 
	Scanner input=new Scanner(System.in);
        	String str = input.nextLine();
        	int count[] = new int[256]; 
        
       	 int len = str.length(); 
        	for (int i=0; i<len; i++) 
	{	
            		count[str.charAt(i)]++; 
       	}
        	int max = -1;   
        	char result = ' ';    
        
        	for (int i = 0; i < len; i++) 
	{ 
            		if (max < count[str.charAt(i)]) 
		{ 
                			max = count[str.charAt(i)]; 
                			result = str.charAt(i); 
            		}	 
        	}
        	System.out.println(result); 
    } 
} 
