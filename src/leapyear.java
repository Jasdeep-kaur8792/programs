public class leapyear {
    public static void main(String[] args)
    {
        int y=2000;
        if(y%400==0)
            System.out.println("leap year");
        else if (y%100==0)
             System.out.println(" not leap year");
        else if (y%4==0)
             System.out.println(" not leap year");

    }
    }

