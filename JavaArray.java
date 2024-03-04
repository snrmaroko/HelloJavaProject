import java.util.Arrays;
import java.util.Scanner;
public class JavaArray {
    /**
     * Java Arrays
     *
     * what is an Array?
     *
     * Suppose we have three variables of type int with different identifiers for each variable.
     *
     * int number1;
     * int number2;
     * int number3;
     *
     * int number1; = 1
     *  int number2 =2;
     *  int number3 =3;
     *
     *  As you can see it seems like a tedius task i order to intialize and use the variable especially if they are for the same purpose.
     *
     *  In Java and other programming languages there is one capability wherein we can use one variable to store a list of data and manipulate them more efficiently. This type of variable is called an array.
     *
     *  An Array stores multiple data items of the same data type, in a contagius block of memory , divided into a number of slots
     *
     *
     * Declaration of an Array
     *
     * Declaring an Array
     *
     * To declare an array, write the data type, followed by a set of square brackets[], followed by identifier name
     *
     * For example:  int[] ages; or int ages [];
     *
     *
     * Instantiation of an Array
     *
     * Array instantiation
     *
     * After  declaring, we must create the array and specify its length with a constructor statement.
     *
     * Definations
     *
     * Instantiation:
     *
     * in Java, this means creation
     *
     * Constructor: -> in order to instantiate an object we need to use  a constructor. This is a method that is called to create a certain object.
     *
     * We will cover more about instanting objects and constructors
     *
     * To instantiate or create array, we write 'new' keyword followed by the square brackets containing number of elements you want the array to have.
     *
     */

    public static void main(String[] args) {

        // for example:
        // declaration

        int ages[];

        // Instantiate objects

        ages = new int[100];

        // or can also be written as

        // declare and instantiate object

        //int ages[] = new[100];

        // we can also instantiate an array by directly initializing it with data.

        // for example

        int [] arr = {1, 2, 3, 4, 5};

        // This statement above declares and instantiates an array of integers with five elements(initialized the values 1 2 3 4 5)

        // boolean array

        boolean [] results = {true, false, true, false};

        // double array

        double [] grades ={ 100, 90, 80, 70};


        String [] days ={ "Mon", "Tue", "Wed","Thur"," Fri" };

        // Accessing elements of an array.

        // to access an array element or part of the array, we use a number called an index or subscript

        // index number or subscript : -> is assigned  to each member of the array , to allow program to access an individual member of the array.
        //-> begins with zero and progress sequential by whole numbers to the end of array.
        // NOTE: Elements inside your array are from zero to sizeof Array -1

        // For example: given the array we declared a while a go, we have

        // assign 10 the  first element
        ages [0] = 10;

        System.out.println(ages[0]);

        // prints the last element in array
        System.out.println(ages[99]);

        // Note: Once an array is declared and constructed , the store value of each member of the array will be initialized to zero for number data type.

        // For reffrenece data types like strings , they are NOT initialized  to blanks or an empty string "", Therefore you must populate the string array explicitly.

        // Example:
        // The following is a sample code on how to print all the elements in the array. Iyt uses a for loop -> Print all the elements of the ages [] array

        int age[]= {2,3,4, 5, 6,6};
        for (int i=0; i<age.length; i++) {
            System.out.println(age[i]);
        }

        // Write a java a program that wil ask the user to enter five student names and store them in an array using for loop


        Scanner sc = new Scanner(System.in);

        //String stdNames = sc.nextLine();

        String[] stdNames = new String[5];
        System.out.println("Please enter the name of Students :  ");
        for (int t = 0; t<stdNames.length; t++)
        {
            System.out.print(" The names of the StudentNames:  "  + (t+1) +":");
            stdNames[t] = sc.nextLine();
        }

        for (int f=1; f< stdNames.length;f++){
            System.out.println(stdNames[f]);
        }


        //Inorder to get the number of elements in array, you can use the length field of an array.

        // The lenght field returns the size of the array.
        // it can be used by writing the following
        // arraname.length

        // example:
        System.out.println(stdNames.length);

        // Create a program that asks the user for 5 integers and prints out their sum and average.

        double num = 0;
        double x =1;
        int sum =0;
        int average=0;

        Scanner scr = new Scanner(System.in);
        System.out.print("Input the number(n) you want to calculate the sum and average: ");
        int n = scr.nextInt();

        // Use a loop to collect n numbers and calculate their sum
        while (x <= n) {
            System.out.println("Input number " + "(" + (int) x + ")" + ":");
            num += sc.nextInt();
            x += 1;
        }
        // output the sum of the numbers

        System.out.println("The Sum of the " + n + " numbers is " + num );


        // Calculate the average of the collected numbers
        double avgn = (num / n);

        // Display the calculated average
        System.out.println("Average: " + avgn);

        // Another option
        int numb=0;

        int [] numbers = new int[5];

        for( int s =0; s<numbers.length; num++){
            System.out.println("Enter the 5 integres: ");
            numbers[s]= sc.nextInt();
        }

        int total = 0;
        int avg=0;

        for (int q=0;q<numbers.length; q++){
            total =total +numbers[q];
        }

        // Average
        avg = total/numbers.length;


        //output

        System.out.println("The sum of the five numbers" + total );
        System.out.println("The average of the five numbers is : " + avg);


        // Mult-Dimensional Array

        // are implemented as array of arrays
        // are declared by appending the appropriate number of bracket pairs  after the array name.
        // syntax
        // type[][] arrayName = new type [row][colum]

        // example
        //a 2D integer array

        int [][] twoD = new int[512][128];

        //3D Array (8 X 16 X 24)

        char [][][] threeD = new char [8][16][24];

        // a 2D string Array 4 rows by 2 columns

        String [][] dogNames= {
                {"terry", "brown"},
                {"kristern","white"},
                {"toby","gray"},
                {"fido","black"},
        };

        // Accessing elements of multdimensional array
        // to access the elements is the same as accessing elements in one dimensional array
        // To access the first element in the first row of the array dogNames, we write the following

        System.out.println(dogNames[0][0]);

        // This will print the string Terry on the screen

        // Challenge.
        // Write a java program to track the grades of students across multiple subjects using a 2D array. Implement the following functionalities to:
        // -> to input the grades for each student in each subject
        // ->calculating and displaying the average grade for each student.
        // ->calculate and display the average grade for each subject.

        // create the variable to store number of students and subjects

        int numStudents;
        int numSubjects;

        //prompt the user to for the numbers and store them in the appropriate arrays

        System.out.println(" Enter number of students: ");
        numStudents =sc.nextInt();

        System.out.println("Enter number subjects: ");
        numSubjects =sc.nextInt();

        // create an array to store the grades
        int [][] studentGrades = new int[numStudents][numSubjects];

        //input grades (using nested for loops)

        for( int i =0; i<numStudents; i++){
            System.out.println("Enter grades for students " + (i+1) + ":");
            for (int j =0; j<numSubjects; j++){
                System.out.println("Enter the grades for subjects " + (j+1) + ":");

                studentGrades[i][j] =sc.nextInt();
            }
        }


        // calculate the average grade for each student and output it

    for(int l = 0; l<numStudents; l++){
        int total1 = 0;
        for(int p =0; p<numSubjects; p++){
            total1 += studentGrades[l][p];
        }
        double ave = (double) total1 / numSubjects;

        System.out.println("The average grade for students: " + (l+1) + " :");
    }
        // calculate the average grade for each subject and output  it.

for (int j = 0; j< numSubjects; j++){
    int total1 =0;
    for (int i=0; i<numStudents; i++){
        total1 += studentGrades[i][j];
    }
    double averageSubject = (double) total1 / numStudents;
    System.out.println( " Average grade for subjects : " +(j+1) + ":" + averageSubject);
}


    }
}
