package V_VariablesAndDataTypes;

public class I_DataTypes {

    public static void main(String[] args) {
//        so, (type variable  name variable  = value variable);

//        - NUMERIC TYPES

//        -- INTEGERS

//        by convention the most used is int

        long l = 1000L;                 // long is a numeric data type, has 8 bytes. so 64 bits = 2^(64-1). very very extra large number
        long almond = 56L;
        // to indicate long we use L at the end of the number

        int myAge = 26;                 // int is also numeric data type, has 4 bytes. so 32 bits = 2^(32-1). very large number, approximated 2 billion positive and negative
        int myNumber = 17653;

        short a = 4;                    // short is also numeric data, has 2 bytes. so 16 bits = 2^(16-1) goes from -32.767 to 32.768
        short cat = 99;

        byte b = 77;                    // byte is also numeric data, has 1 byte. so 8 bits = 2^(8-1) goes from -128 to 127
        byte apple = 85;


//        -- RATIONAL / DECIMAL

//        by convention the most used is double

        float f = 12.6F;                  // float is a decimal data type, has 4 bytes.
        float geek = 88.987F;
        // to indicate float we use F at the end of the number

        double d =5.4;                    // double stores decimal numbers, has 8 bytes. so 8x8 = 64 bits
        double dl = 3.141563034454546;



//        - BOOLEAN

        boolean work = true;               //  stores true or false, both in low case
        boolean student = false;

//        - TEXT

//        -- CHAR

        char c = 67;                       // char is a text data type, uses the unicode table. Has 2 bytes
                                           // keeps only one alphabetic character inside simples quotes
        System.out.println(c);
        // uses the unicode table, prints the letter C

        char letter = 'a';

    }
}