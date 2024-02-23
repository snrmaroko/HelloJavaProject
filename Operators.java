public class Operators {
    /**
     * Operators in Java
     *
     * We have different types of operators in java
     * 1. Arithmetic Operators
     * 2. Relation Operators
     * 3. Logical Operators
     * 4. Conditional Operators
     *
     * They follow a certain precedence so that the compiler can know which operator to evaluate first in case multiple operators are used in the statement.
     */

    public static void main(String[] args){
        // create two integers
        double x = 20;
        double y = 6;

        // 1. Arithmetic Operators
        // Addition -> +
        System.out.println(x + y); // returns 26

        // Subtraction -> -
        System.out.println(x - y); // returns 14

        // multiplication -> *
        System.out.println(x * y); // returns 120

        // Division -> /
        System.out.println(x / y); // returns 3.33333333

        // Modulus -> % (finds the remainder of a division)
        System.out.println(x % y); // returns 2

        // 2.Increment and Decrement Operators (++, --)
    }
}
