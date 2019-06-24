import java.util.*;

public class EvenEncode {
  
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String str=input.next().toLowerCase();
         
    for(int i=0;i<str.length();i++)
    {
      
        char ch=str.charAt(i);
        String num="";
        for(int j=i+1;j<str.length();j++)
        {
          if(!(str.charAt(j)>='a'&&str.charAt(j)<='z'))
          {
            num+=str.charAt(j)+"";
          }
          else{
            i=j-1;
            break;
          }
        }
        int n=0;
        if(num.length()>0)
       	{
         	n=Integer.valueOf(num);
       	}
        if(n%2==0)
        {
       		for(int k=0;k<n;k++)
       		{
        	  System.out.print(ch);
        	}
    	}
        else
        {
          System.out.print(ch+""+n);
        }
        
      
    }
    
      
  }
}
