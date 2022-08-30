public class addmatrix {
    public static void main(String[] args) {
        int a[][]  = {{1,2,3}};
        int [][] b = {{4,5,6}};
        int [][] c = new int[1][3];
        for (int i = 0; i<=1; i++){

            for (int j = 0; j<=3; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j] + " ");


            }
        }
    }
    }