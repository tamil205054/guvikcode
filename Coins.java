      import java.util.*;
class Coin 
{ 
	static int minCoins(int coins[], int n, int sum) 
	{ 
    if (sum == 0) 
    {
        return 0; 
    }
	int res = Integer.MAX_VALUE; 
	for (int i=0; i<n; i++) 
	{ 
		if (coins[i] <= sum) 
		{ 
			int temp = minCoins(coins, n, sum-coins[i]); 
            if (temp != Integer.MAX_VALUE && temp + 1 < res)
            { 
                res = temp + 1;
            } 
		} 
	} 
	return res; 
	} 
	public static void main(String args[]) 
	{ 
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int sum=input.nextInt(); 
        int coins[] = new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i]=input.nextInt();
        }  
	System.out.println(minCoins(coins, n, sum)); 
	} 
}
