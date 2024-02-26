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
        // increment and decrement operators increase and decrease a value stored ina number by 1.
        // unary increment operator ++
        // unary decrement operator --

        // For example:  count = count + 1; increment the value of count by 1
        // the above example is equivalent to: count++

        // operator     Use             Description
        // ++           x++             Increment x by 1; evaluates to the value of x before it was incremented

        // ++           ++x             Increment x by 1; evaluates to the value of x after it was incremented

        // --           x--             Decrements x by 1; evaluates to the value of x before it was decremented

        // --           --x             Decrements x by 1; evaluates to the value of x after it was decremented


        // The increment and decrement operators can be placed before or after an operand.

        // When used before an operand, it causes the variable to be incremented or decremented by 1, and then the new value is used in the expression in which it appears.

//        For example
        int i = 10;
        int j = 3;
        int k = 0;

//        k = ++j + i; // will result to k = 4 + 10 = 14
//        System.out.println("The value of k is: " + k);

//        k = j++ + i; //
//        System.out.println("The value of k is: " + k);

        int op = 1;

        System.out.println(op++); // 1
        System.out.println(op); // 2

        k = j-- + i; //
        System.out.println(k);
        System.out.println(j);

        // 3. Relational Operators
        // compare two values and determines the relationship between those values
        // the output of evaluation is a boolean value -> true or false

        // Operator    name                    Use         Description
        // >           greater than            x > y       x is greater than y
        // >=         greater than or equal to x >= y  x is greater than or equal to y
        // <           less than               x < y        x is less than y
        // <=           less than or equal to  x <= y        x is less than or equal to y
        // ==          equal to                x == y       x is equal to y
        // !=          not equal to            x != y       x is not equal to y

        // Examples
        int a = 20;
        int b = 6;

        // Greater than
        System.out.println("20 > 6? " + (a > b));
        // Greater than or equal to
        System.out.println("20 >= 6? " + (a >= b));
        // less than
        System.out.println("20 < 6? " + (a < b));
        // less than or equal to
        System.out.println("20 <= 6? " + (a <= b));
        // equal to
        System.out.println("20 == 6? " + (a == b));
        // not equal to
        System.out.println("20 != 6? " + (a != b));


        // 4. Logical Operators
        // have one or two boolean operands that yield a boolean result
        int c = 2;
        int d = 1;

        // There are 3 logical operators
        // i. logical AND -> when using logical AND operator, both operands(expressions) must evaluate to true to get a true result.
        // symbol -> &&

        // logical AND Truth table

        // x1       x2      Result
        // TRUE     TRUE    TRUE
        // TRUE     FALSE   FALSE
        // FALSE    TRUE    FALSE
        // FALSE    FALSE   FALSE

        // Examples
        // c is 2 and d is 1
        System.out.println((c > d) && (c < d));
        System.out.println((c > d) && (d < c));

        System.out.println((c <= d) && (d != c));

        // ii. logical OR -> when working with logical OR, you only need one operand(expression) to evaluate to true to get the entire result as true.
        // symbol -> ||

        // logical OR Truth table

        // x1       x2      Result
        // TRUE     TRUE    TRUE
        // TRUE     FALSE   TRUE
        // FALSE    TRUE    TRUE
        // FALSE    FALSE   FALSE

        // Example
        System.out.println((2 == 1) || (2 > 2));
        System.out.println((2 != 1) || (2 != 2));

        // iii. logical NOT
        // takes in one argument, wherein that argument can be an expression, variable or constant.
        // symbol -> !

        // Here is the Truth table for !

        // x1           Result
        // TRUE         FALSE
        // FALSE        TRUE

        boolean isRainning = true;
        boolean isRunning = false;

        System.out.println(!isRainning);
        System.out.println(!isRunning);


        // a login program

        // user login credentials
        String userName = "Dennis";
        String password = "p@$$w0rd";

        // correct user login credentials
        String correctUserName = "Dennis";
        String correctPassword = "p@$$w0rd";

        // check if the user entered the correct credentials
        if ((userName == correctUserName) && (password == correctPassword)) {
            // if user credentials match (meaning true), login the user
            System.out.println("Logged in Successfully!");
        } else {
            // if user credentials do not match(meaning false), throw an error
            System.out.println("Invalid Username or Password, Please try again!");
        }


        // 5. Conditional Operator

        // symbol -> ?:
        // is also called a ternary operator
        // the structure/syntax of an expression using a conditional operator is
        // exp1 ? exp2 : exp3

        // wherein:
        // exp1 -> is a boolean expression whose result must either be true or false.

        // Result:
        // if exp1 is true, exp2 is the result returned
        // if exp1 is false, then exp3 is the result returned

        String status = "";
        int grade = 80;

        // get the status of the student
        status = (grade >= 60) ? "Passed" : "Failed";

        // print status
        System.out.println(status);


        // Tomorrow -> Getting input from keyboard

    }
}
