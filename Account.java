import java.util.ArrayList;

public class Account {

    private String name;
    private double balance;
    private double previous;

    ArrayList<Double> history = new ArrayList<>();

    public Account(String name,double balance){
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
        previous = amount;
        history.add(previous);
    }

    void withdraw(double amount){
        balance -= amount;
        previous = -amount;
        history.add(previous);
    }

    double getBalance(){
        return balance;
    }

    void GetHistory(){
        if (history.isEmpty()){
            System.out.println("\nNothing yet");
        }
        System.out.println();
        for (int i = 0; i < history.size(); i++){
            if (history.get(i) > 0){
                System.out.println("Deposited: " + history.get(i));
            } else if (history.get(i) < 0) {
                System.out.println("Withdrawn: " + history.get(i));
            }
        }
    }





}
