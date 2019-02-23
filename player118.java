import java.util.*;
class arraysort
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String str[]=line.split(" ");

        for (int i=1 ;i<str.length; i++)
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
                 if(str[str.length-1].length()==str[str.length-2].length())
                {
                  System.out.print(str[str.length-2]);
                }
                else
                {
                  System.out.print(str[str.length-1]);
                }
               

    }
}
