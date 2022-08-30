public class override {
    public static void main(String arg[]) {

        drink m = new drink();
        m.juice();
        m.lemon();
        m.orange();
    }
}
    class a {


        void apple() {

            System.out.println("red");
        }

        void mango() {

            System.out.println("yellow");
        }

        void orange() {

            System.out.println("orange");
        }

    }
    class vegetable extends a {

        void veg() {

            System.out.println("vegetables");
        }

        void carrot() {

            System.out.println("red");
        }

        void orange() {

            System.out.println("6slices");
        }

    }

    class drink extends vegetable {

        void juice() {

            System.out.println("pineapple");
        }

        void lemon() {

            System.out.println("soda");
        }

        void orange() {

            System.out.println("12slices");
        }

    }




