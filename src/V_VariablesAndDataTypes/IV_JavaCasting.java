package V_VariablesAndDataTypes;

public class IV_JavaCasting {
    public static void main(String[] args) {

//        Java Casting

/*
          - Widening Casting (automatically) - converting a smaller type to a large type size

                byte -> short -> char -> int -> long -> float -> double


          - Narrowing Casting (manually) - converting a large type to smaller type

                double -> float -> long -> int -> char -> short -> byte

          - When you do narrowing casting you will lose data

 */

        double d = 4.5;
        int b = (int) 4.5;
        // forcing b to receive 4.5
        // the number is truncate, if it loses 0.5
        System.out.println(b); // prints 4


        int a = 5;
        double s = a;
        // if double > int, no problem in the assignment, as in double -> int


    }
}
