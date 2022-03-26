import java.util.Scanner;
class banking_account{
    int amount = 5000;
    public void initiate()
    {
        login l1 = new login();
        try{
            l1.acceptInput();
            l1.verify();
            
        }catch(Exception e)
        {
            try{
                l1.acceptInput();
                l1.verify();
                
            }catch(Exception f)
            {
               
             }
        }
    }
    public int getBalance(){
        return amount;
    }
    public void add(int amt){
        amount = amount + amt;
        System.out.println("Amount deposited Successfully");
        System.out.println(" ");
        System.out.println("Total Balance: " +amount);
        System.out.println(" ");
    }
    public void withdraw(int amt){
        System.out.println(" ");
        if(amount < amt)
        {
            invalid_transaction invalidWithDraw = new invalid_transaction("InValid Withdrawal Amount");
            System.out.println(invalidWithDraw.getMessage());
        }else{
            amount = (amount - amt);
            System.out.println("Please Collect your " + amt +" Rupees");
            System.out.println(" ");
            System.out.println("Available Balance: " +amount);
            System.out.println(" ");
        }
    }
}