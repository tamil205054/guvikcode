import java.util.*;
class prime
{
     public static void main(String[] args) 
     {
		 Scanner input =new Scanner(System.in);
		 int num=input.nextInt(),flag=0;
		 for(int i=2;i<num;i++)
		 {
			 if(num%i==0)
			 {
				 flag=1;
			 }
		 }
		 if(flag==0)
		 {
			 System.out.println("yes");
		 }
		 else
		 {
			 System.out.println("no");
		 }
     }
}
