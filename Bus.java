import java.util.*;
public class Bus
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int w=input.nextInt();
		int x=input.nextInt();
		int y=input.nextInt();
		int z=input.nextInt();
	    int count=0;
	    int x1=x-y;
	    if(x1>=0)
	    {
	      int di=(w-y)*2;
	      for (int i=0;i<z;i++)
	      {
	          if(i==z-1)
	          {
	              di=di/2;
	          }
	          if(x1<di)
	          {
	              x1=x;
	              count+=1;
	          }
	          x1=x1-di;
	          if(x1<0)
	          {
	              count=-1;
	              break;
	          }
	          di=2*w-di;
	      }
	      
	          System.out.println(count);
	    }
	    else
	    {
	        System.out.println(-1);
	    }
	}
}
