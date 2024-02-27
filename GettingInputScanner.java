import java.util.Scanner;

public class GettingInputScanner {
    public static void main (String[] args){

        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Declare variables

        String userName ="";

        int userAge =0;

        // Ask user for Name

        System.out.print("please enter your name:  ");

        userName = sc.next();

        // Ask for Age

        System.out.print("Enter your Age:  ");

        userAge = sc.nextInt();

        // Output the data

        System.out.print("Hello  " + userName + ", you are  " + userAge + " years old ");

        // close the scanner object

        sc.close();



    }

}
