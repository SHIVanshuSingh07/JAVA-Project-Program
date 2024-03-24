import java.util.Scanner;

public class atm {
  
    public static boolean validateInputAmount(int amount) {
        return amount > 0;
    }

    public static void main(String[] args) {
        int balance = 100000; // Initial balance
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be withdrawn:");
                    int withdraw = sc.nextInt();
                    if (!validateInputAmount(withdraw)) {
                        System.out.println("Enter amount greater than zero");
                        break;
                    }
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to be deposited:");
                    int deposit = sc.nextInt();
                    if (!validateInputAmount(deposit)) {
                        System.out.println("Enter amount greater than zero");
                        break;
                    }
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close(); // Close Scanner before exiting
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
            System.out.println(); // Add a newline for better readability
        }
    }
}
