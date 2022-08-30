import java.util.*;

class services {
    private double money = 100000;
    private int pin;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    void deposit() {
        Scanner jas = new Scanner(System.in);
        System.out.println("enter the pin code");
        pin = jas.nextInt();
        if (pin == 22) {
            System.out.println("enter the money");
            Scanner deep = new Scanner(System.in);
            double amount  = deep.nextInt();
            System.out.println("enter the amount");
             amount = money + amount;
            System.out.println("money is" + money +"    after deposit is" + amount);
        }
    }

    void withdraw() {
        Scanner jas = new Scanner(System.in);
        System.out.println("enter the pin code");
        pin = jas.nextInt();
        if (pin == 22) {
            System.out.println("enter the money");
            Scanner deep = new Scanner(System.in);
            double amount = deep.nextInt();
            if (money > amount) {
                System.out.println("enter the amount");
                amount = money - amount;
                System.out.println("money is" + money + "after withdraw is" + amount);
            } else {
                System.out.println("balance is insufficent");
            }

        }
    }
}

public class bank  {
    public static void main(String[] args) {
        System.out.println("enter 1 for deposit");
        System.out.println("enter 2 for withdraw");
        Scanner deep = new Scanner(System.in);
        int input = deep.nextInt();
        services kaur = new services();
        switch (input) {
            case 1:
                kaur.deposit();
                break;
            case 2:
                kaur.withdraw();
                break;
            default:
                System.out.println("wrong input");


        }
    }
}


