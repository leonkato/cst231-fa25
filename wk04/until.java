package wk04;
//
//public class SI_sample {  was Conditionals
//}

// package wk03_mon;

import java.util.Scanner;

public class until {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String password = "";
        String name = "";
        String secret = "hello123";

        // Don't make this mistake....
        // while ( password != secret ) {
        while ( !password.equals(secret) ) {

            System.out.print("Enter your name: ");
            name = in.next();
            System.out.print("Enter password: ");
            password = in.next();

            if (!password.equals(secret)) {
                System.out.println("Password is incorrect");
                System.out.println();
            }
//            else {
//                break;
//            }
        }


        System.out.println("Welcome " + name);




//        if (true) {
//            do something if the condition is true
//            System.out.println("Always true");
//        }

//        if (false) {
//            System.out.println("Never be here!");
//        }
    }
}