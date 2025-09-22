package wk05;

public class msContinueExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i % 2 != 0) {  // is i even?
                i++;
                continue;            // skips odd numbers
            }
            // prints only even numbers
            System.out.println(i);
            i++;
        }
        System.out.println("done");
    }
}

