public class singleinheri {

    int a = 10;
    String b = "jasdeep";
    char c = 'k';
    void start() {
        int d = 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class kaur extends singleinheri {
    public static void main(String[] args) {
        kaur deep = new kaur();
        deep.start();
    }
}
