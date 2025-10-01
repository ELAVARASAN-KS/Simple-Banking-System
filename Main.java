import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int flag=0;
        operations op=new operations();
        while(flag==0)
        {
            System.out.println("THe operations are\n1.Check Balance\n2.Withdrawl\n3.deposit\n4.exit");
            System.out.print("Enter operation to perform : ");
            try{
                int operation=scan.nextInt();
                op.check(operation);
            }
            catch(Exception e)
            {
                System.err.println("Error occured");
            }
            scan.nextLine();
            System.out.print("Do you want perform other operations (yes/no) :");
            String operate=scan.nextLine();
            if(operate.equals("yes"))
            {
                flag=0;
            }
            else{
                flag=1;
            }
        }
        scan.close();
    }
}
