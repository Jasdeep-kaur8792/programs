public class pattern1
{
    public static void main(String[] args)
    {
        int i, j, k;
        {
            for (i = 1; i < 6; i++)
            {
                for (j=i;j<=5;j++) {
                    System.out.print("  ");
                }
               int temp=1;
                for (k = 1; k<=i;k++)
                {
                    System.out.print(temp+"  ");
                    temp=temp*(i-k)/k;
                }
                System.out.println();
            }
        }

    }
}
