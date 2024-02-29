
import java.io.*;
import java.util.Scanner;
public class DecisionControlStructures {

    /**
     * Decision control structures.
     * <p>
     * Thse are java statements that allow us to select and execute specific blocks of code while skipping other sections
     * <p>
     * There are three
     * <p>
     * 1.if statement
     * 2.if- else statement
     * 3.if -else - if statement
     */

    public static void main(String[] args) {
        // 1. if- statement

        // specifies that a statement or block of code will be executed if and only if a certain boolean statement is true.

        //syntax

        //if (boolean_expression)
        //  statement;

        //or


        //if (boolean_expression){
        //statement 1
        //statement2

        // where the boolean_expression is either a boolean expression or boolean variable.
        // example:

        int grade = 68;

        // print congratulation if grade is greater than  60

        if (grade > 60)
            System.out.println("Congratulations!");

        if (grade > 60) {
            System.out.println("Congratulations!");
        }

// print congratulation if grade is greater than  60 and also print "you passed!"

        if (grade > 60) {
            System.out.print("Congratulations!");
            System.out.print("You passed!");

        }

        System.out.println("======================================");

        //2. if- else statement
        // used when one want to execute a certain statement if one condition is true and different condition is false
        // syntax

        //if (boolean_expression) {
        //statement1;
        //statement2;
        //}else{
        //statement;
        //}
        int gradeB = 50;
        if (gradeB > 60) {
            System.out.println("Congratulations !");
            System.out.println("You passed !");
        } else {
            System.out.println("You failed!");

        }


    // Missing notes!!

        // iii. if-else-if-else statement
        // The statement in the else clause of an if-else block can be another if-else structures
        // This cascading of structures allow us to make more complex selections
        // used to execute multiple courses of action

        // syntax

        // if (condition1) {// Example:
        //
        //        // print "Excellent" if grade is greater than 90, "Very Good" if it is greater than 60, otherwise "Sorry You failed"
        //if (grade > 90) {
        //            System.out.println("Excellent");
        //        } else if (grade > 60) {
        //            System.out.println("Very Good");
        //        } else {
        //            System.out.println("Sorry You failed");
        //        }
        //



    // switch statement
// Switch allow for multiple outcomes
// it has the following (syntax).
//    switch (switch_expression){
//    case case_select1:
//        statement1;
//        statement2;
//        break;
//    case case_selector2:
//            statement1;
//            statement2;
//            break;
//     default:
//                statement1;
//                statement2;
//        }

// where
// -> switch expression: is an integer, or character expression or string
// -> case_selector1, case_selector2 and so on is a unique integer or character constants

// when a switch statement is encountered :
// Java first evaluates the switch expression , and jumps to the case whose selector matches the value of the expression.

// the program executes the statements inorder from that point on until a break statement is encountered , skipping then to the first statement after the end of that switch structure.

// if none of the cases are satisfied the default block is executed, take note however, tha the default part is optional.

//Note:
//Unlike with the if statement, the multiple statements are executed in the switch statement without needing the curly braces.

// when a case in the switch statement has been matched or statement associated with that case are executed. Not only that , the statement associated with succeeding cases are also executed.

//To prevent the program from executing statements in the subsequent case, we use a break statement as our last statement.


    int score = 92;
 switch(score){
        case 100:
            System.out.println("Excelent!");
            break;
        case 90:
            System.out.println("Good Job!");
            break;
        case 80:
            System.out.println("Study harder!");
            break;
        default:
            System.out.println("Sorry, you failed!");


// create a Java program that ask the user for an integer between 1 and seven inclusive and then outputs the day of week. if user enter 1 the output is sunday.

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number from 1 to 7 to show the day of week-> 1 being Sunday: ");
    int dayOfWeek = scanner.nextInt();
switch (dayOfWeek){
    case 1:
        System.out.println("Sunday");
            break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Tuesday");
        break;
    case 4:
       System.out.println("Wednesday");
       break;
    case 5:
       System.out.println("Thursday");
       break;
    case 6:
        System.out.println(" Friday");
        break;
    case 7:
        System.out.println("Sarturday");
        break;
    default:
       System.out.println("Invalid input. Please enter a number from 1 to 7.");

}


// Ask user for color then print if that is favourite color if it matches with one in system.

    String favouriteColor =null;
favouriteColor = scanner.next();
switch (favouriteColor.toLowerCase()){
    case "red":
        System.out.println("Your Favourite color is " + favouriteColor);
        break;
    case "green":
        System.out.println("Your Favourite color is " + favouriteColor);
        break;
    case "blue":
        System.out.println("Your Favourite color is " + favouriteColor);
        break;
    default:
        System.out.println("Your Favourite color is Missing in the DBS");

}
 }
 }
}