import java.util.*;
class digit{
	
	public static void main(String[] args) 
	{
		String ip;
        Scanner	sc = new Scanner(System.in);
        ip=sc.next();

        char ch[]=ip.toCharArray();
    
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isDigit(ch[i]))
            {    
              System.out.print(ch[i]);
            }    
        }	
	}
}
