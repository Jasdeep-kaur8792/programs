import java.util.Scanner;

public class Abstract {
    public static void main(String[] args) {
        System.out.println("enter 1 for deposit");
        System.out.println("enter 2 for withdraw");
        Scanner deep = new Scanner(System.in);
        int input = deep.nextInt();
        ab kaur = new A ();
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
abstract class ab {
    double money = 10000;
    String name;

    int pin;

    abstract void deposit();

    abstract void withdraw();
}

class A extends ab {
    void deposit() {
        Scanner jas = new Scanner(System.in);
        System.out.println("enter the pin code");
        pin = jas.nextInt();
        if (pin == 22) {
            System.out.println("enter the money");
            Scanner deep = new Scanner(System.in);
            double amount = deep.nextInt();
            System.out.println("enter the amount");
            amount = money + amount;
            System.out.println("money is" + money + "    after deposit is" + amount);
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

















