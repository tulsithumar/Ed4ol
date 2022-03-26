import java.util.Scanner;
class menu{
    int selectedOption;
    banking_account b = new banking_account();
    public void showMenu()
    {
        System.out.println("Please Select an option below:");
        System.out.println("Press 1 to Deposit Amount.");
        System.out.println("Press 2 to Withdraw Amount.");
        System.out.println("Press 3 to View Balance");
        System.out.println("Press any key to Exit");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press any key: ");
        selectedOption = scanner.nextInt();
        switch (selectedOption) {
            case 1:
                 deposit d = new deposit();
                 int depamt =  d.userInput();
                 b.add(depamt);
                 showMenu();
                break;
            case 2:
                 System.out.print("Please Enter the amount to withdraw: ");
                 int withamt=scanner.nextInt();
                 b.withdraw(withamt);
                 showMenu();
                break;
            case 3:
                  System.out.println("Your Account Balance is "+b.getBalance()+" Rupees");
                  System.out.println(" ");  
                  showMenu();
                break;
        
            default:
                  System.out.println("Transaction Ended, Your ABC Bank Account Logout Successfully !");
                  System.exit(0);
                break;
        }
        
    }
}