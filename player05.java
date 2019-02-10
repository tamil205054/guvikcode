import java.util.*;
class roman
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        String romanletter=in.nextLine();
        romanletter=romanletter.toUpperCase();
      
        int num=0;
          
         switch(romanletter)
                    {  
                            case "I":
                            num = 1;
                            break;
                            case "II":
                            num = 2;
                            break;
                            case "III":
                            num = 3;
                            break;
                            case "IV":
                            num = 4;
                            break;
                            case "V":
                            num = 5;
                            break;
                            case "VI":
                            num = 6;
                            break;                        
                            case "VII":
                            num = 7;
                            break;
                            case "VIII":
                            num = 8;
                            break;
                            case "IX":
                            num = 9;
                            break;
                            case "X":
                            num = 10;
                            break;
                            case "XI":
                            num = 11;
                            break;
                            case "XII":
                            num = 12;
                            break;
                            case "XIII":
                            num = 13;
                            break;
                            case "XIV":
                            num = 14;
                            break;
                            case "XV":
                            num = 15;
                            break;
                            case "XVI":
                            num = 16;
                            break;
                            case "XVII":
                            num = 17;
                            break;
                            case "XVIII":
                            num = 18;
                            break;
                            case "XIX":
                            num = 19;
                            break;
                            case "XX":
                            num = 20;
                            break;
                    } 
                    
        
           
    System.out.println(num);       
        }
      
                       
    
}
