package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMOperationInterface op = new ATMOperationImpl();
       int atmnumber = 12345;
       int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Bharadwaj ATM!");
      System.out.print("Please Enter your ATM Number : ");
        int atmNumber = in.nextInt();
        System.out.println("Please Enter your pin : ");
        int pin = in.nextInt();
        if((atmnumber == atmNumber) && (atmpin == pin)){
            while (true) {
                System.out.println("1.View Available Balance \n 2.Withdraw Amount \n 3.Deposit Amount \n 4.View mini-statement \n 5. Exit Application");
                System.out.println("Please Enter your Choice : ");
                int choice =in.nextInt();
                if(choice == 1){
                    op.viewBalance();
                } else if (choice == 2){
                    System.out.println("Enter the Amount to Withdraw");
                    double withdrawAmount  = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (choice == 3){
                    System.out.println("Enter the Amount to Deposit");
                    double depositAmount = in.nextDouble(); // 5000
                    op.depositAmount(depositAmount);
                } else if (choice == 4){
                       op.viewMiniStatement();
                } else if (choice == 5){
                    System.out.println("Please Collect your ATM Card \n Thank you for using Bharadwaj ATM");
                    System.exit(0);
                } else {
                    System.out.println("Please enter the correct choice");
                }
            }
        } else {
            System.out.println("ATM number or pin is Incorrect");
            System.exit(0);
        }
    }
}