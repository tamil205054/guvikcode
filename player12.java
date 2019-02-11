 import java.util.*;
 class rightShift
 {
    public static void main(String ar[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        ArrayList<Integer> arrNum=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            arrNum.add(input.nextInt());
        }
        Collections.rotate(arrNum,k);
        for(int num:arrNum)
        {
            System.out.printf("%d ",num);
        }
    }
 } 
