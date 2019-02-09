import java.util.*;
class string{
	
	public static void main(String[] args) 
	{
		String ip;
        Scanner	sc = new Scanner(System.in);
        ip=sc.next();

        char ch[]=ip.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);    
        }	
	}
}
