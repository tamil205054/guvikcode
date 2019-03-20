import java.util.*;
class MinCost {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		char[] strar1=str1.toCharArray();
		char[] strar2=str2.toCharArray();
		int l1=strar1.length;
		int l2=strar2.length;
		int cost=0;
		cost=Math.abs(l1-l2);
		int strlen=l1>l2?l2:l1;
		for(int i=0;i<strlen;i++)
		{
			if(strar1[i]!=strar2[i])
			{
				cost++;
			}
		}
		System.out.println(cost);
	sc.close();
	}

}
