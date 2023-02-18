package VI_JavaClasses;

import java.util.Scanner;

public class II_StringClass {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String firstName = "Antonio";
        String lastName = "Machado";
        String completeName = firstName + " " + lastName;
        System.out.println("Hello, " + completeName);

        System.out.print("How old are you? ");
        int age = read.nextInt();

        System.out.println("Great! I will add to the system that you sir " + completeName + " are " + age + " years old.");

    }
}
