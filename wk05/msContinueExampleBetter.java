package wk05;

public class msContinueExampleBetter {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int n = i++;            // one increment in a single place
            if (n % 2 != 0) {
                continue;  // skip odd numbers
            }
            System.out.println(n);  // prints 0 2 4 6 8
        }
        System.out.println("done");
    }
}