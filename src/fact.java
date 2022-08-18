import java.util.Scanner;
public class fact {
    public static void main(String[] args)
    {
        Scanner js = new Scanner(System.in);
        System.out.println("enter any number");

        int i,n,fact=1;
        n=js.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
            System.out.println("Factorial is" + fact);

        }

    }
}
