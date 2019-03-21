import java.util.*;
class stackpali
{
    public static void main(String[] args) 
	{
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        Deque<Character> stack=new LinkedList<>();
        for(int i=0;i<str.length();i++)
		{
            stack.offerFirst(str.charAt(i));
		}
        StringBuilder sb=new StringBuilder();
        Iterator itr=stack.iterator();
        while(itr.hasNext())
		{
            sb.append(itr.next());
		}
        String r=sb.toString();
        if(str.equals(r))
		{	
		System.out.println("YES");
        }
		else 
		{
			System.out.println("NO");
        }
		input.close();
    }
}
