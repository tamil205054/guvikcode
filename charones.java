  import java.util.*;
class onetime{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        char ch[]=str.toCharArray();
        HashSet<Character> h = new HashSet<Character>();
        ArrayList<Character> result=new ArrayList<Character>(); 
        for(int i=0;i<ch.length;i++)
        {
            if(h.add(ch[i]))
            {
                result.add(ch[i]);
            }
        }
        for(int i=result.size()-1;i>=0;i--)
        {
            
        System.out.print(result.get(i));
        }
        in.close();
    }
}
