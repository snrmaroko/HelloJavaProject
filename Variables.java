public class Variables {
    /**
     * Variables in Java
     *
     * A variable is named memory location in the computer's memory for storing different types of data
     * A variable is an item for storing the state of objects
     * A variable is a container/box for holding data
     *
     * A variable has:-
     * data type -> specifies the type of data that the variable can hold
     * name -> used to reference the variable (must follow the identifier rules)
     */

    public static void main(String[] args){
        // Declaring and initializing variables
        // in Java, we declare variables as follows:

        // syntax:
        // <data_type> <variable_name> [= initial_value];
        // declare and initialize 8 variables of 8 data types

        // String
        String userName = "Dennis";

        // Integer
        int userAge = 18;

        // Byte
        byte userId = 100;

        // Short
        short userStaffNumber = 12345;

        // Long
        long userAccountBalance = 15243663738L;

        // Float
        float userApprovedLoanAmount;

        // Double
        double userTransferredAccountAmount;

        // Character
        char favLetter = 'd';

        // variable declared on one line (Not recommended)
        double quiz = 10, exam = 0, grade = 0;

        // Recommended (declare a single variable on a single line)
        double studentQuiz = 10;
        double studentExam = 0;
        double studentGrade = 0;

        String firstName = "Dennis";
        String lastName = "Muthui";

        // Outputting variables data
        // System.out.println() -> appends a new line (line break)
        // System.out.print() -> append the data on the same line
        System.out.println(firstName);
        System.out.println(lastName);

        String userGreeting = "Hello";
        String userTarget = "World";

        System.out.print(userGreeting);
        System.out.print(userTarget);

        // In Java Programming we have two types of variables namely:-

        // -> Primitive variables: stores data in the actual memory location of where the variable is e.g. int, long ...
        int num = 10; // Primitive variable example

        // -> Reference variables: stores the address in the memory location. Points to another memory location where the actual data is. e.g. String
        String favLanguage = "Java";


    }
}
