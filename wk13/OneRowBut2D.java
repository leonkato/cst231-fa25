package wk13;

// Can I make a 1 row 2d array?  Yes, I can.
public class OneRowBut2D {
    public static void main(String[] args) {

        // this is fine
//        int[][] foo = new int[1][2];
//        foo[0][0] = 100;
//        foo[0][1] = 101;
        // so is this
        int[][] foo = {{101, 102}};
        // let's see it
        print2D(foo);

        System.out.println(foo.length);
        System.out.println(foo[0].length);
    }

    public static void print2D(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

