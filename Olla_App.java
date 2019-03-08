import java.util.*; 
class Olla
{
    static void display(String type, int dis,int cost)
    {
        System.out.println("OLLA CAB SERVICE");
   
        System.out.println("TRAVEL TYPE:"+type);
        System.out.println("TRAVELLING DISTENCE:"+dis);
        System.out.println("RATE PER KILO METER:"+cost);
        System.out.println("TOTAL PAYMENT:"+cost*dis);
    }
    public static void main(String[] args) 
    {
        
        Scanner in=new Scanner(System.in); 
        System.out.println("Select the vehicle Type");
        System.out.println("1.Auto");
        System.out.println("2.Cab");
        System.out.println("3.Share");
        int opn=in.nextInt();
        int price=0,st=0,end=0,dis=0;
        switch(opn)
        {

            case 1:
                 price=15;
                System.out.println("Enter the Starting KM:");
                 st=in.nextInt();
                System.out.println("Enter the Ending KM");
                end=in.nextInt();
                 dis=end-st;
                display("Auto", dis, price);
            break;
            
            case 2:
                 price=20;
                System.out.println("Enter the Starting KM:");
                 st=in.nextInt();
                System.out.println("Enter the Ending KM");
                 end=in.nextInt();
                 dis=end-st;
                
                 display("Cab", dis, price);
            break;
            case 3:
                 price=12;
                System.out.println("Enter the Starting KM:");
                 st=in.nextInt();
                System.out.println("Enter the Ending KM");
                 end=in.nextInt();
                 dis=end-st;
                
                display( "Share", dis, price);
            break;
            default:
            System.out.println("Invalid Vehicle");
        }
    }

}
