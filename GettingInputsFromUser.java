import java.io.*;

public class GettingInputsFromUser {
    /**
     * geeting user input
     * we have two ways for that
     * 1. Buffered reader class -> console line way
     * 2. JOptionpane class -> GUI (Graphocal user interface)
     */

    public static void main (String [] args){
        //lets get user input using bufferedReader class
        //Create an instance of BufferedReader class
        BufferedReader dataIn = new BufferedReader (new
        InputStreamReader(System.in));

        //Create a variable for holding the user input

        String userName = null;

        // Use Try ... catch block to execute the code

        try {
            // Ask user for their name

            System.out.print("please enter your name:  ");
            userName = dataIn.readLine();
        } catch (IOException ex){
            System.out.println("There was an error reading the user input....");
        }
        //output user input

        System.out.println("Greetings  " + userName);

        // Write a java program that asks the user for their name and age. Then converts the age into minutes the user has lived

        String staffName = null;

        int age1 = 0;
        try {
            // Enter StaffName

            System.out.print("please enter your name:  ");
            staffName = dataIn.readLine();

            // Ask user for their age

            System.out.print("please enter your age:  ");
            age1 = dataIn.read();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        // convert user age to minutes

        int ageInMinutes = age1*365*24*60;
        // output staffinput

        System.out.println("The Staff " + staffName + ", has lived for " + age1 + "  years , equivalent to " + ageInMinutes + "  minutes");
    }
}

