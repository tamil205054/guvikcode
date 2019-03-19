import  java.util.*;
class array
{
    public static  void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
       String email=input.next();
	   int count=0;
	   if(email.contains("@"))
	   { 
			count++;
	   }
	   int flag=0;
	   int k=0;
	   int t=-2;
	   int be=0;
	   int before=0;
	   for(int i=0;i<email.length();i++)
	   {
		   if(email.charAt(i)=='@'||email.charAt(i)=='.')
		   {
			   flag++;
		   }
		 
		   if(email.charAt(i)=='@')
		   {
			   k=1;
			   be=1;
		   }
		    if(be==0)
		   {
			   before++;
		   }
		   if(k==1)
		   {
			   t++;
		   }
		   if(email.charAt(i)=='.')
		   {
			   k=0;
		   }
	   } 
	   if(email.substring(email.length()-4,email.length()).equals(".com"))
	   {
		   count++;
	   }
	   if(t>=4)
	   {
		   count++;
	   } 
	if(before>=3)
	   {
		   count++;
	   } 
		   
	   if(flag==2)
	   {
		   count++;
	   }
	   if(count==5)
	   {
		   System.out.print("YES");
	   }
	   else
	   {
		    System.out.print("NO");
	   }
	   
	}
}
