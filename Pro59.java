import java.util.*;
public class Pro59
{
    static String[] divide(String str,String s)
    {
        String array[]=new String[2];
        String str1="";
        String str2="";
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='|')
            {
                flag=1;
            }
            if(flag==0)
            {
                str1+=str.charAt(i);
            }
            else
            {
                    if(str.charAt(i)!='|')
                    {
                        str2+=str.charAt(i);
                    }
            }
            
        }
        array[0]=str1;
        array[1]=str2;
        return array;
    }
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
        String str1=input.next();
        String str2=input.next();
        String arr[] = divide(str1,"|");
         
        if((arr[0]+str2).length()==arr[1].length())
        {
            System.out.println(arr[0]+str2+"|"+arr[1]);    
        }
        else if(arr[0].length()==(arr[1]+str2).length())
        {
            System.out.println(arr[0]+"|"+arr[1]+str2);            
        }
        else
        {
            System.out.println("Impossible");
        }
	    
	   // System.out.println(output);
	}
}
