public class actions {
    private int total=0;
    public int check_balance()
    {
        if(total==0)
        {
            return 0;
        }
        return total;
    }
    public int withdrawl(int amount)
    {
        try
        {
            if(amount<total)
            {
                total-=amount;
                return total;
            }
            else{
                throw new Exception();
            }
        }
        catch(Exception e)
        {
            System.out.println("The Withdrawl Amount greater than Balance amount");
            return total;
        }
       
    }
    public int deposit(int amount)
    {
        total+=amount;
        return total;
    }

}
