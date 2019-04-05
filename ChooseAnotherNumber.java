import java.util.*;

 class ChooseAnotherNum
	{
  		static long SumOfDigit(long n) 
		{
        		long sum = 0;
        		while (n != 0) 
			{
            			sum += n % 10;
  		   		n /= 10;
       			}
        		return sum;
    		}
    		public static void main(String[] args) 
		{
        		Scanner input = new Scanner(System.in);
        		long n = input.nextInt();
        		List<Long> result = new ArrayList<Long>();
        		int count = 0;
        		for (long i = n; i >= n/2; i--) 
			{
            			if (i+ SumOfDigit(i) == n) 
				{
                			result.add(i);
                			count++;
                			break;
            			}
        		}
        		System.out.println(count);
        		for (int i = 0; i < result.size(); i++)
			{
            			System.out.println(result.get(i));
			}
			input.close();
		}

 
	}
