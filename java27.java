 import java.util.Scanner;
 class Numeric {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);  
        String number = s.next(); 
        boolean numeric = true;

        try 
        {
            Double num = Double.parseDouble(number);
        } 
        catch (NumberFormatException e) 
        {
            numeric = false;
        }

        if(numeric)
          {
          System.out.println("yes");
          }
        else
        {
            System.out.println("No");
        }
    }
}
