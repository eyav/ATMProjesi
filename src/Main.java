import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        do {
            System.out.print("Please, enter your username :");
            userName = input.nextLine();
            System.out.print("Please,enter your password: ");
            password = input.nextLine();
            if (userName.equals("erdener") && password.equals("1234")) {
                System.out.println("You have entered succesfully !");


                do {
                    System.out.println("\n1-Deposit \n 2-Withdraw Money\n 3-Inquiry Balance \n 4-Log out ");
                    System.out.print("\nChoose the action you want to make : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("What is the amount of money you want to deposit? : ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            System.out.print("\nYour current balance :" + balance);
                            break;
                        case 2:
                            System.out.print("What is the amount of money you want to withdraw? :");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= withdraw;
                                System.out.println("Your current balance :" + balance);

                            }
                            break;
                        case 3:
                            System.out.println("Your current balance :" + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("See you soon.");
                break;


            } else {
                right--;
                System.out.println("You entered wrong");
                System.out.println("Your remaining right: " + right);
                if (right == 0) {
                    System.out.println("Your access right has expired and your card is blocked.");
                }
            }
        } while (right > 0);
    }
}