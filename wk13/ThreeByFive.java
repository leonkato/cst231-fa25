package wk13;

public class ThreeByFive {

    // declare initialize and allocate at the same time
    public static void main(String[] args) {
        int[][] foo = {{11, 12, 13, 14, 15},
                       {21, 22, 23, 24, 25},
                       {31, 32, 33, 34, 35}};

        print2D(foo);
        // number of columns
        System.out.println(foo.length);
        // number of rows
        System.out.println(foo[0].length);
        System.out.println();

        int[][] bar = new int[4][5];

        print2D(bar);

        for (int m = 1; m <= bar.length; m++) {
            for (int n = 1; n <= bar[m-1].length; n++) {
                bar[m-1][n-1] = 100 * m + n;
            }
        }
        print2D(bar);
    }

    public static void print2D(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

