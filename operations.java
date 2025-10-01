import java.util.*;

public class operations {
    Scanner scan=new Scanner(System.in);
    private int result=0;
    private int amount=0;
    actions ac=new actions();
    public void check(int operation)
    {
        
        try{
            switch(operation){
                case 1:
                    result=ac.check_balance();
                    System.out.println("The Balance of Account : $ "+result);
                    break;

                case 2:
                    System.out.print("Enter amount to withdrawl :");
                    amount=scan.nextInt();
                    result=ac.withdrawl(amount);
                    System.out.println("The Balance Amount : $ " +result);
                    break;

                case 3:
                    System.out.print("Enter amount to deposit :");
                    amount=scan.nextInt();
                    result=ac.deposit(amount);
                    System.out.println("The Balance Amount : $ " +result);
                    break;
                
                case 4:
                    System.exit(0);
                    break;
                
                default:
                    throw new Exception("Invalid Input");
            }
        }
        catch(Exception e)
        {
            System.err.println("The error occured :" + e.getMessage());
        }
        finally{
            System.out.println("Thank you for banking !!!");
        }
    }
}
