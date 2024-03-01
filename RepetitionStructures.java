import java.util.Scanner;

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




    // output: 0 5 10 15 20 25 30 ..... 50 and reverse.

        int k=0;
        do {
            System.out.println(k);
            k = k + 5;
        }while(k<51);

    System.out.println("================================");

        int z=50;
        do {
            System.out.println(z);
            z = z - 5;
        }while(z>=0);
    System.out.println("================================");

        // tomorrow -> for loop
        //3.for loop
        // a for loop allows execution of the same code a nummber of times
        // for loop syntax

        //for(intitializationExpression; loopcondtion;stepExpression){
        //statement1;
        //statement2;
        //}
    // Where;
    //-> initializationExpression:initialize the loop variable
    //->loopCondition:compares the loop to some limit
    //-> StepExpression: updates the loop variable

        //Example:

        // output : 1 2 3 4 5 6 7 8 9 10

        for(int c =1; c < 21; c++) {
            System.out.println(c);

        }
        System.out.println("=========================");
//output: 10 20 30 ....100

        for(int d =10; d < 101; d=d+10) {
            System.out.println(d);
        }
        System.out.println("=========================");


        //Branching statements
    //branching allows us to redirect the flow of the program execution.

        //Java offers three branching statements
        //i.->break
        //ii-> continue
       //iii.->return

        //i. Break statement
        //Terminates the enclossing switch statement , and flow of control transfers to the statement immediately following the switch statement.
        // This can also be used to terminate a for, while or do-while loop

        //example

        String[] studentNames = {"Joanoah", "Bradley","Muzna", "Hamza", "Ian", "Praise", "Ephraim"," Frank", "Benson","Yasmin","Phill", "Brenda", "Dominic","Nethan","Ryan"};

        // create scanner object

        Scanner sc =new Scanner (System.in);

        //ask user for name to search

        System.out.println(" Enter name of student to search : ");

        String searchName = sc.next();
        boolean foundName = false;

        for (int idX = 0; idX < studentNames.length; idX++){
            if(studentNames[idX] .equals(searchName)){
                foundName = true;
                break;
            }
        }

        if (foundName == true) {
            System.out.println(searchName + " found!");
        }else{
            System.out.println(searchName + "  not found!");
        }

        System.out.println("================================");
        //ii. Continue statement
        // skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop variable, basically skipping the reminder of the iteration of the loop.

        // example:

        String[] names = { "Beah", "Bianca", "Beah", "Beah"};

        int count =0;

        for (int p = 0; p< names.length; p++){
            if(!names[p].equals("Beah")){
                continue; // skip statement
            }
            count++;
        }

        System.out.println(" There are " + count + " Beahs in this list");


        System.out.println("================================");

        //Nested for loop
        //create a times table for user provided number

        //ask user for the times table number.

        System.out.print("Enter the times table number:  ");

        int timesTable = sc.nextInt();

        for (int times = 1; times<= 12; times++){
            System.out.println(timesTable + " X "  +  times+ " = " + timesTable * times);
        }

        System.out.println("================================");
  // create whole times table
        for(int q = 1; q<= 12; q++){
            for (int r=1; r<=12; r++){
                System.out.println(q + "  X  " +  r  +  " = " + (q*r));
            }
            System.out.println("--------------------------------------------");
        }

        System.out.println("================================");


        //Return statement

        // is used to exit from the current method
        // flow of control  returns to the statement that follows the original method call.
        // to return a value , simply put the value or expression that calculates the value after the return keyword

        //for example:

        //return count++; or return "java";
        // the type of data declared by the method must match the type of value returned by the return statement.

        // when a method is declared void, use the form of return that doesnt return a value.

        //for example : return;

        // we will cover more about return statement later when we discuss about methods.

        System.out.println("================================");
        // close our scanner object
        sc.close();


        // Next -> JAVA ARRAYS


  }
    }


