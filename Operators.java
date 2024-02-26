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

        //increment and decrement operators increase and decrease a value stored in a number by 1.
        // unary increment operator by ++
        // unary decrement operator --
        // for example: count = count +1; increment the value of count by 1
        // the above example is equivalent to count++

        // operator     use         description
        //++            x++         increment x+1 , evaluates if the value of x before it was incremented
        //++            ++x         increments x by 1, evaluates if the value of x after it was incremented
        //--            x--         decrements x by 1, evaluates if the value of x before it was decremented
        //--            --x         decrements x by 1,evaluates if the value of x after it was decremented

        // the increment can be place before or after an operand.
        // when used before operand it causes the variable  to be incremented or decremented by 1. and then the new value is used in the expression in which it appears.

        int j = 10;
        int i = 3;
        int k = 0;
        int m =0;

//        k = ++j + i; // this will result to k = 4 +10 = 14
//        System.out.println (" The value of k is : " +k);

        m = j++ + i;

        System.out.println("The value of m is :" +m);

        int op = 1;
        op++;
        System.out.println(op++); //1
        System.out.println(op);  //2

        k = j-- + i;
        System.out.println(k);

        //3. Relational operators
        // They compare two values and determine the relationship between those values.
        //the output of evaluation is a boolean value -> meaning true or false

        // operator      name                use             description
        // >        greater than              x>y          x is greater than y
        // >=   greater than or equals to   x>=y          x is greater than  or equal to y
        // <    less than                   x<y           x is less than y
        // <=   less tthan or equals to    x<=y          x is less that or equals to y
        //  ==  equal to                 x==y           x is equal to y
        // !=   not equal to             x!=y           x is not equal to y.

        // examples

        int a = 20;
        int b = 6;

        // greater than

        System.out.println("20 > 6" + (a > b));
        //greater than
        System.out.println("20 >= 6" + (a >= b));
        //greater than or equals to
        System.out.println("20 < 6" + (a < b));
        //less than
        System.out.println("20 <= 6" + (a <= b));
        // less than or equals to
        System.out.println("20 == 6" + (a == b));
        //equal to
        System.out.println("20 != 6" + (a != b));
        // not equal to

        //4.Logical operators
        // Have one or two bollean operands that yield a boolean result.

        int c = 2;
        int d = 1;

        //There are three logical operators
        //i. logical AND -> when using logical AND operator , both operands must evaluate true to get a true result .
        // the Symbol is &&
        //Logical AND Truth Table
        // x1       x2     Result
        // TRUE    TRUE     TRUE
        // True    FALSE    FALSE
        // FALSE   TRUE     FALSE
        // FALSE   FALSE    FALSE

        // For examples
        System.out.println((c>d) && (c< d));
        System.out.println((c>d) && (d < c));
        System.out.println((c<=d) && (d !=c));


        //ii. logical OR -> when working with logical OR , you only need one expression to evaluate true to get the entire result as true.
        // Symbol is ||
        // logical OR truth table

        // x1       x2     Result
        // TRUE    TRUE     TRUE
        // TRUE    FALSE    TRUE
        // FALSE   TRUE     TRUE
        // FALSE   FALSE    FALSE


        // Example

        System.out.println((2 == 2) || (2 > 2));
        System.out.println((2 != 1) || (2 != 2));

        // iii. Logical NOT
        //takes in one arguement wherein that arguement can be an expression, variable or constant.
        // Symbol ->!

//        //here  is the truth table for !
        // x1         Result
        // TRUE       FALSE
        // FALSE      TRUE
         boolean israining = true;
         boolean isrunning = false;

         System.out.println(!israining);
         System.out.println(!isrunning);

         // a login program

        // user login credentilas

        String userName = "Dominic";
        String password = "p@$$w0rd";

        // correct user login credentials

        String correctUserName = "Dominic";
        String correctPassword = "p@$$w0rd";

        // check if the user entered the correct credentials

        if ((userName == correctUserName) && (password == correctPassword)){

    // if user credentials much (meaning true) log in the user
            System.out.println("logged in successfuly");
        } else{
    // if user credentials do not much(meaning false) throw an error
            System.out.println("Invalid Username or Password, please try again");
        }

        //5. Conditional Operator
        //Symbol-> ?:
        // is also called a ternary operator
        // the stracture/ syntax of an expression of conditional operator is
        // exp1 ? exp2 : exp3
        // wherein :
        //exp1 -> is a boolean expression whose result must either be true or false
        // Result:
        //if exp1 is true, exp2 is the result returned
        //if exp1 is false , then exp3 is the result returned.

        String status = "";
        int grade = 80;

        // get the status of the student.

        status = (grade>= 60)? "passed": "failed";

        // print stattus of student

        System.out.println(status);

        // Tommorrow -> getting inputs from the keyboard



    }
}
