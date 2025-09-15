package wk04;

public class Mystery {
    public static void main(String[] args) {
        int thing1 = 23;
        int thing2 = 7;
        // successive subtraction shows what % means
        while (thing1 >= thing2) {
            thing1 -= thing2;
        }
        System.out.println(thing1);
    }
}
