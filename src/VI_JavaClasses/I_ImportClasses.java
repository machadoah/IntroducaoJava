package VI_JavaClasses;

import java.util.Scanner; // class Scanner, library extern

public class I_ImportClasses {
    public static void main(String[] args) {
//        for getting user input we will Scanner class

        Scanner read = new Scanner(System.in); // We will use this for getting user input

        System.out.print("Enter number integer: ");
        int a = read.nextInt();

        System.out.println("Number you entered: " + a);
    }
}
