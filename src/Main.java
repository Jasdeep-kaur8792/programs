import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner js = new Scanner(System.in);
        System.out.println("enter any number");

        int i,n;
        n=js.nextInt();
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                break;
            }
        }
           if(n==i)
           {
               System.out.println("number is prime");
           }
           else
           {
               System.out.println("number is not prime");
        }

    }
}