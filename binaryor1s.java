import java.util.*;
class bitwise
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int result=num1|num2;
        String bin=Integer.toBinaryString(result);
        int count=0;
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
            {
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
