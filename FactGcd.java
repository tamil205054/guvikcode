import java.util.*;
class FactGct
{  
	static int gcd(int a, int b) 
	{ 
		 
        if (a == 0) 
        {
		    return b; 
        }
        if (b == 0) 
        {
            return a; 
        } 
        if (a == b)
        { 
			return a; 
        }
		 
        if (a > b)
        { 
		    return gcd(a-b, b); 
        }
        return gcd(a, b-a); 
	} 
     static int fact(int a)
     {
         int result=1;
         for(int i=1;i<=a;i++)
         {
             result=result*i;
         }
         return result;
     }
	public static void main(String[] args) 
	{ 
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(gcd(fact(a),fact(b))); 
        input.close();
	} 
} 
