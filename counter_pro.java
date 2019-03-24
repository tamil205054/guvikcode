import java.util.*;
class count{
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int value=3,temp=3;
	   for(int i=1;i<num;i++)
	   {
	       temp--;
	       if(temp==0)
	       {
	           temp=value=value*2;
	       }
	   }
		System.out.println(temp);
	  input.close();  
	}
}
