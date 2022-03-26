import java.io.*;  
import java.util.Scanner;
class login{
    int ac_number = 1249498014;
    int ac_pass = 41089494;
    int ac, pw;
    public void acceptInput(){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ABC Bank Account Number: ");
        ac = scanner.nextInt();
        System.out.print("Enter Password: ");
        pw = scanner.nextInt();
    }
    public void verify() throws Exception{
         
        if(ac == ac_number && pw == ac_pass)
        {
            System.out.println("Your ABC Bank Account Login Successfully !");
            banking_account b = new banking_account();
            System.out.println(" ");
            System.out.println("Your Account Balance is: "+b.getBalance()+" Rupees");
            System.out.println(" ");
            menu m1 = new menu();
            m1.showMenu();
        }else{
            invalid_transaction loginfailed = new invalid_transaction("Incorrect Login Credentials !");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }
}