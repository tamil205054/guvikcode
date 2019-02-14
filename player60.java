import java.util.*;
class triangle
{
    public static void main(String ar[])
    {
        Scanner input =new Scanner(System.in);
        String str1=input.next();
        String str2=input.next();
        int count=0;
        int len1=str1.length();
        int len2=str2.length();
        for(int i=0;i<len1;i++)
         {
             for(int j=0;j<len2;j++)
             {
                 if(i!=j)
                 {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        count=1;   
                    }
                 }
             }
         }     
         if(count==1)
         {
         System.out.print("yes"); 
         }
         else
         {
             System.out.print("no");
         }
    }
}
