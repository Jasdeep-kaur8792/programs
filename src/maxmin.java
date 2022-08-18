public class maxmin
{
    public static void main(String[] args)
    {
        int i;
        int a[] = {20, 40, 50, 80, 10};
        int max = a[0];
        int min = a[0];
        for (i = 0;i<a.length; i++)
        { /* */
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("max value=" +max);
        System.out.println("min value=" +min);
    }

}