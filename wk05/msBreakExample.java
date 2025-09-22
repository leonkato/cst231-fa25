package wk05;

public class msBreakExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 7) {
            if (i == 4) {
                System.out.println("Stopping early");
                break;          // stop the loop at 7
            }
            i++;
            System.out.println(i);    // prints 1 2 3 4
        }
        System.out.println("After loop...");
    }
}

