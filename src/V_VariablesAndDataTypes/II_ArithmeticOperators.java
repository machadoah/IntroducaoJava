package V_VariablesAndDataTypes;

public class II_ArithmeticOperators {
    public static void main(String[] args) {

//        - Arithmetic Operators

        double a = 5.6;
        int b = 5;
        int c = 77;
        int d = 99;

        char p = 'A';
        char q = 77;
        char r = 'B';

//        -- Addition(+):

        System.out.println(a + b); // 5.6 + 5 = 10.6

        System.out.println(c + d); //  77 + 99 = 176

        System.out.println(p+q); // A = 65, so 65 + 77 = 142

//        -- Subtraction(-):

        System.out.println(d - c); // 99 - 77 = 22

//        -- Multiplication(*):

        System.out.println(d * c); // 99 * 77 = 7623

//        -- Division(/):

        System.out.println(99/77); // prints only the number integer, so 1
        System.out.println((double)99/77); // 99/77 = 1.2857142857142858
    }
}
