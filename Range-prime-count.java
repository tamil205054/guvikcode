import java.io.*;
import java.util.*;
class digit{

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
		List<Integer> result=new ArrayList<Integer>();
		for(int i=l;i<r;i++)
		{
			int n=i;
		int sum=0;
       while(n!=0)
       {
          sum = sum + n % 10; 
            n = n/10; 
       } 
	   	int flag=0;
				for(int j=2;j<sum;j++)
				{
					 
					if(sum%j==0)
					{
						flag++;
					}
				 
				}
				if(flag==0)
				{
					if(sum!=1)
					{
					result.add(sum);
					}
				}
		}
	 
			System.out.print(result.size());
		 
    }
}
