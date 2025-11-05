package wk11;

import java.util.Random;

public class pl11 {

    public static void main(String[] args) {
        int max = 10;
        Random r = new Random();
        // System.out.println(genRandom(10, r));


        for (int i = 0; i < 100; i++){
            int bottom = 0, top = 0;
        while (bottom == top) {
            int v1, v2;
            v1 = genRandom(max, r);
            v2 = genRandom(max, r);
            if (v1 > v2) {
                bottom = v2;
                top = v1;
            } else if (v2 > v1){
                v2 = top;
                v1 = bottom;
            }
        }

        System.out.println("top: " + top);
        System.out.println("bottom: " + bottom);
}

    }

    public static int genRandom(int max, Random rand) {
        int r = Math.abs(rand.nextInt()) % max + 1;
        return r;
    }

}
