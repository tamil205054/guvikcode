
import java.util.*;
class repeat
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        String k=ip.nextLine();
	  int limit=Integer.parseInt(k,2);
	  for(int n=limit;n<100000;n++)
	  {
	  if((Math.ceil((Math.log(n) / Math.log(2)))) == (Math.floor(((Math.log(n) / Math.log(2))))))
	  {
		System.out.print(n);
		break;
	  }
	  }
        ip.close();    
    }
}
