import java.util.*;

public class LapResult
{
	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		// List<String> output=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			int result=input.nextInt();
			List<Integer>digit=new ArrayList<Integer>();
			while(result>0)
			{
				digit.add(result%10);
				result=result/10;
			} 
			// System.out.print(digit.size());
			if(digit.size()==2||digit.size()==1)
			{
			if(digit.get(digit.size()-1)==1||digit.get(digit.size()-1)==4||digit.get(digit.size()-2)==8&&digit.get(digit.size()-1)==7)
			{
                          				// ('c');
				System.out.println("+");
			}
			}
			else
			{
			 if(digit.get(0)==5&&digit.get(1)==3)
			{
				System.out.println("-");
			}
			else if(digit.get(digit.size()-1)==9&&digit.get(0)==4)
			{
				System.out.println("*");
			}
			else if (digit.get(digit.size()-1)==1&&digit.get(digit.size()-2)==9&&digit.get(digit.size()-3)==0) 
			{
				System.out.println("?");	
			}
			else
			{
				System.out.println("*");
			}
		}
		}
		// System.out.print(output);
		}	
	}
