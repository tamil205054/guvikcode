import java.util.*;
public class OddEvenCount
{
	public static void main(String[] args) 
	{
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	List<Integer>digit=new ArrayList<Integer>();
	List<Integer>output=new ArrayList<Integer>();
	while(n>0)
	{
		digit.add(n%10);
		n=n/10;
	}
	int count=0;
	 for(int i=digit.size()-1;i>0;i--)
	 {
	 	int k=digit.get(i)+digit.get(i-1);
	 	if(k%2!=0)
	 	{
	 		count++;
	 	}
	 	else
	 	{
	 		output.add(count);
	 		count=0;
	 	}
	 	output.add(count);
	 }
	 Collections.sort(output);
	 int m=output.get(output.size()-1);
	 if(m==0)
	 {
	 	System.out.print(0);
	 }
	 else
	 {
	 	System.out.print(m+1);
	 }

}
}
