package bankpackage;

import java.util.Scanner;

/**
 * Created by yst865 on 4/6/17.
 */
public class Application {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int selection = 1;
        Customer c1 = new Customer();

        while (selection != 6) {
            System.out.println("Please enter what you want: \n" +
                    "1) Name \n" +
                    "2) Account Number \n" +
                    "3) Balance \n" +
                    "4) Deposit Money \n" +
                    "5) Withdraw Money \n" +
                    "6) Exit\n");
            selection = scan.nextInt();
            if (selection < 1 || selection > 6) {
                System.out.println("Please enter a valid number (1-6): ");
                selection = scan.nextInt();
            }

            switch (selection) {
                case 1:
                    if (c1.getName() == null) {
                        System.out.println("Please enter your name:");
                        scan.nextLine();
                        c1.setName(scan.nextLine());
                        System.out.println("Thank you " + c1.getName()+ "\n");
                    }
                    else {
                        System.out.println("We already have your name " + c1.getName()+ "\n");
                    }
                    break;
                case 2:
                    if (c1.getAccount() == null) {
                        System.out.println("Please enter your account:");
                        scan.nextLine();
                        c1.setAccount(scan.nextLine());
                        System.out.println("Your account number is: " + c1.getAccount() + "\n");
                    }
                    else {
                        System.out.println("We already have your account " + c1.getAccount() +"\n");
                    }
                    break;
                case 3:
                    if (c1.getBalance() == 0) {
                        System.out.println("Please enter your balance: ");
                        c1.setBalance(scan.nextDouble());
                        System.out.println("Your current balance is: "+ c1.getBalance()+"\n");
                    }
                    else {
                        System.out.println("Your current balance is: "+ c1.getBalance());
                    }
                    break;
                case 4:
                    System.out.println("How much do you want to deposit? \n");
                    c1.setDeposit(scan.nextDouble());
                    c1.changeBalanceD(c1.getDeposit());
                    System.out.println("Your new balance is: " + c1.getBalance());
                    break;

                case 5:
                    System.out.println("How much do you want to withdraw? \n");
                    c1.setWithdraw(scan.nextDouble());
                    if (c1.getWithdraw()>c1.getBalance()) {
                        System.out.println("You have insufficient funds!  Please enter a new amount!");
                        c1.setWithdraw(scan.nextDouble());
                    }
                    c1.changeBalanceW(c1.getWithdraw());
                    System.out.println("Your new balance is: " + c1.getBalance());
                    break;
                case 6:
                    break;
            }





        }

    }
}
