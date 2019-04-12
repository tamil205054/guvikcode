import java.util.*;
class Number
{
    static String NumberSystem(String s)
    {
        char ch[]=s.toCharArray();
        String st="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='0')
            {
                st=st+"3";
            }
            else
            {
                st=st+"4";
            }
            
        }
        return st;
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        List<String> result=new ArrayList<String>();
        int n=input.nextInt();
        for(int i=1;i<=16;i++)
        {
             for(int j=0;j<(int)Math.pow(2, i);j++)
             {
                String str=Integer.toBinaryString(j);
                
                if(str.length()==i+1)
                {
                     
                    result.add(NumberSystem(str));
                }
                else
                {
                    int balence=i-str.length();
                    String zero="";
                    for(int k=0;k<balence;k++)
                    {
                        zero=zero+"0";
                    }
                    str=zero+str;
                    
                    result.add(NumberSystem(str));

                }
             }
        }
        System.out.println(result.get(n-1));
        input.close();   
    }
}
