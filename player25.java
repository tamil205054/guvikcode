import java.util.*;
class arraysort
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String str[]=new String[n]; 
        for(int i=0;i<n;i++)
          {
            str[i]=input.next();
          }
        Arrays.sort(str);
        for (int i=1 ;i<n; i++)
            {
              String temp = str[i];
              int j = i - 1;
                while (j >= 0 && temp.length() < str[j].length())
                {
                  str[j+1] = str[j];
                  j--;
                }
                str[j+1] = temp;
              }
      for(int i=0;i<n;i++)
        {

          System.out.print(str[i]);
          if(i<n-1)
          {
            System.out.print(" ");
          }

      }
    }
}
