import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Specify the account\n");
        System.out.print("Name: ");
        String name = scr.nextLine();
        System.out.print("Balance: ");
        double balance = Double.parseDouble(scr.nextLine());

        Account account = new Account(name,balance);

        System.out.printf("\nWelcome %s!\n",name);

        // pass the object to the method so i can use the object methods
        ChooseOption(account);

    }



    public static void ChooseOption(Account obj){
        Scanner scr = new Scanner(System.in);

        System.out.print("\nPlease choose an option\n1.Balance\n2.Deposit\n3.Withdraw\n4.Transaction History\n5.Exit\n");

        System.out.print("Option chosen: ");
        int option = Integer.parseInt(scr.nextLine());

        double action;
        switch (option){
            case 1:
                System.out.println("\nYour current balance is: " + obj.getBalance());
                ChooseOption(obj);
                break;
            case 2:
                System.out.print("\nChoose an amount to deposit: ");
                action = Double.parseDouble(scr.nextLine());
                obj.deposit(action);
                ChooseOption(obj);
                break;
            case 3:
                System.out.print("\nChoose an amount to Withdraw: ");
                action = Double.parseDouble(scr.nextLine());
                obj.withdraw(action);
                ChooseOption(obj);
                break;
            case 4:
                obj.GetHistory();
                ChooseOption(obj);
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid Option");
                ChooseOption(obj);
        }
    }
}
