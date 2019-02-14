import java.util.*;
class find
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
          String str=input.nextLine();
        
          
          String str1="";
          String string[]=str.split(" ");
        for(int k=0;k<string.length;k++)
        {
            str1=str1.concat(string[k]);
        }
        //System.out.print(str1);
        String str2=str1.toLowerCase();
          char ch[]=str2.toCharArray(); 
          int n=str1.length();  
          for(int i=0;i<n;i++)
            {
                int count=0;
                for(int j=0;j<n;j++)
                {
                    if(ch[i]==ch[j])
                    { 
                        count++;
                    }
                }
                if(count==1)
                {
                    System.out.printf("%s ",str1.charAt(i));
                } 
            } 
    
        
    }
}
