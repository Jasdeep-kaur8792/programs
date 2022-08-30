public class MULTILEVEL {
    public static void main(String[] args) {
        juice m=new juice();
        m.apple();
        m.lemon();
        m.yellow();
        m.mango();
        m.pizza();
        m.carrot();
        m.orange();
        m.veg();
    }
}
class types
{
  public void apple()
    {

        System.out.println("red");
    }

     public void mango()

    {

        System.out.println("yellow");
    }

    public void orange()

    {

        System.out.println("orange");
    }

}

class vegetables extends types
{

    public void veg()

    {

        System.out.println("vegetables");
    }

    public void carrot()

    {

        System.out.println("red");
    }

    public void pizza()

    {

        System.out.println("6slices");
    }

}

class juice extends vegetables {

    public void green() {

        System.out.println("pineapple");
    }

    public void lemon() {

        System.out.println("soda");
    }

    public void yellow() {

        System.out.println("12slices");
    }

}

