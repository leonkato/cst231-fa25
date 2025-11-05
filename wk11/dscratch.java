package wk11;


public class dscratch {
    public static void main(String [] args) {
        int x = 1;
        int y = 0;
        System.out.println(x + " ");
        System.out.println(y + " ");
        a(x);
        y = b(x);
        System.out.println(x + " ");
        System.out.println(y + " ");
        x = c(x);
        d(y);
        System.out.println(x + " ");
        System.out.println(y + " ");
    }
    public static void a(int x) {
        ++x;
    }
    public static int b(int x) {
        return ++x;
    }
    public static int c(int x) {
        System.out.println(++x + " ");
        return x;
    }
    public static void d(int x) {
        System.out.println(++x + " ");
    }
}