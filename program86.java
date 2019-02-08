import java.util.*;
class value { 
  
    public static void main(String[] args) 
    { 
        Scanner input=new Scanner(System.in);
        String c =input.next(); 
        char ch[] = c.toCharArray(); 
        int flag=0;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(ch[j]==ch[i])
                {
                    flag=1;                     
                }
            }
        
        } 
        if(flag==0)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        } 
    } 

} 
