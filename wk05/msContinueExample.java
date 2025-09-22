package wk05;

public class msContinueExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i % 2 != 0) {
                i++;
                continue;            // skips odd numbers
            }
            // runs only for even I
            System.out.println(i);
            i++;
        }
        System.out.println("done");
    }
}

