import java.util.*;
class Case
{
    public static void main(String ar[])
     {
        Scanner in=new Scanner(System.in);
        String sen=in.nextLine().toLowerCase();
        int len=0,i=0;
        //System.out.print(sen);
        String str[] = sen.split(" ",-2);
        
      ///System.out.print(str.length);        
        while(i<str.length)
        { 
          int j=0;
            // str[i]=str[i].replace(str[i].charAt(0),Character.toUpperCase(str[i].charAt(0)));
            char ch[]=str[i].toCharArray();
            int chlen=ch.length;
            while(j<chlen)
            {
              ch[0]=Character.toUpperCase(str[i].charAt(0));
              System.out.print(ch[j]);
              j++;
            }
            System.out.print(" ");
          //  System.out.print(chlen);              
        i++;
        }
    }
}
