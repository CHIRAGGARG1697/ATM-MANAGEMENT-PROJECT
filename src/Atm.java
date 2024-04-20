import java.sql.SQLOutput;
import java.util.Scanner;

public class Atm {
    int Pin = 1250;
    float Balance;
    String Name = "CHIRAG GARG";

    public void checkpin(){
        System.out.println("Enter Your PIN");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin== Pin){
            System.out.println("Welcome " + Name);
            menu();
        }
        else{
            System.out.println("Enter A Valid Pin");
            checkpin();
        }

    }
    public void menu(){
        System.out.println(" Enter Your Choices :");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Your A/C Balance");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1){
            withdrawMoney();

        } else if (choice==2) {
            depositMoney();


        } else if (choice==3) {
            accountBalance();


        } else if (choice==4) {
            return;

        }else {
            System.out.println("Enter A Valid Choice");

        }

    }
    public void withdrawMoney(){
        System.out.println("Enter Amount You Want To Withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance= Balance-amount;
            System.out.println("Amount Withdrawn Successfully");
        }
        menu();
    }
    public void accountBalance(){
        System.out.println("Your Balance is: " + Balance);
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter Amount You Want To Deposit");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Money Deposited Successfully");
        menu();

    }
}
  class Atmmachine{
    public static void main(String[] args){
        Atm obj = new Atm();
        obj.checkpin();

    }
        }
