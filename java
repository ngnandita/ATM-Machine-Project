import java.util.Scanner;   

public class ATM {          /

    public static void main(String[] args) {   

        Scanner sc = new Scanner(System.in);   
        
        int balance = 210000; 
        int pin = 2005;       
        int enteredPin;      
        
        System.out.println("-----Apka Welcome hai ATM Machine -----");  
        
        System.out.print("Enter your PIN: ");   
        enteredPin = sc.nextInt();
        if (enteredPin == pin) {

            System.out.println("Login Successful"); 
           
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();   
            if (choice == 1) {
                System.out.println("Your Balance is: " + balance);
            }
            else if (choice == 2) {

                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt(); 
                if (withdraw <= balance) {
                    balance = balance - withdraw;   
                    System.out.println("Please collect your cash");
                    System.out.println("Remaining Balance: " + balance);
                } 
                else {
                    System.out.println("Insufficient Balance");  
            }

           
            else if (choice == 3) {

                System.out.print("Enter amount to deposit: ");
                int deposit = sc.nextInt();  

                balance = balance + deposit;  
                System.out.println("Amount Deposited Successfully");
                System.out.println("New Balance: " + balance);
            }

           
            else {
                System.out.println("Invalid Option");
            }

        }

    
        else {
            System.out.println("Wrong PIN Access Denied");
        }

    }
}
