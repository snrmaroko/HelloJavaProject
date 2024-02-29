public class RepetitionStructures {
    // Are java statements that allow to execute a specific blocks of code a number of times

    // there are 3 types:
    //1. while loop
    //2.do-while loop
    //3.for-loop

    public static void main(String[] args) {
        //1. while-loop-> is a statement or block of code that is repeted as long as some condtion is satisfied.

        //while-loop has the form syntax

        //while(boolean_expression){
        //statement1;
        //statement2;
        //}

        // the statements inside the while-loop is executed as long as the boolean expression evaluates to true

        //Example:
        // write a while loop that prints integers 1 2 3 4 5 6 7 8 9 10
        int x = 1;
        // repeat as long as value of x is less than  or equal 10
        while (x < 11) {
            System.out.println(x);
            //x++;
            x += 1;  // same as above
            //x =x+1;  // same as above
        }

        System.out.println("================================");

        // output 0 2 4 6

        int y = 0;
        while (y <= 20) {
            System.out.println(y);
            y += 2;

        }

        System.out.println("================================");
// output 15 12 9 6 3 0 -3 -6 -9 -12 -15
        int m = 15;
        while (m >= -15) {
            System.out.println(m);
            m =m- 3;

        }
        System.out.println("================================");


        //2. Do... while loop

        //statements inside a do while loop are executed several times as long as the condition is meant/true
        // it is similar to while loop , the main difference is that a statement inside a do-while loop are executed at least once

        //syntax

        //do{
        //statement1;
        //statement2;
        //}while(boolean_expression);

        //output: 1 2 3 4 5 6 7 8 9 10

        int n =1;

        do {
            System.out.println(n);
            n++;
        }while(n<=10);
    System.out.println("================================");

    // tomorrow -> for loop
    //3.for loop


    // output: 0 5 10 15 20 25 30 ..... 50 and reverse.


    }

}
