import java.util.Scanner;

public class AgeInSeconds {
    /**
     * Write a java program that asks the user for their name, and age. The program should use four to five functions to output the user age in seconds
     */

    public static void main(String[] args) {
        // call our display user info method
        displayUserInfo();
    }
    // create the scanner object here
    static Scanner sc = new Scanner(System.in);

    // create a method to prompt the user for their name
    private static String userName(){
        // prompt the user to enter their name
        String name = null;
        System.out.print("Please enter your name: ");
        name = sc.next();
        return name;
    }

    // create a method to prompt the user for their age
    private static int userAge(){
        int age;
        System.out.print("Enter your age too: ");
        age = sc.nextInt();
        return age;
    }

    // create a function to convert the user age to seconds
    private static double userAgeToSeconds(int age){
        double ageInSeconds = age * 365.25 * 24 * 60 * 60;
        return ageInSeconds;
    }

    // create a function to display the user info in a nice format
    private static void displayUserInfo(){
        String name = userName();
        int age = userAge();
        double ageInSeconds = userAgeToSeconds(age);
        System.out.println("Hello " + name + ", you have lived for " + ageInSeconds + " seconds, which means you are " + age + " years old.");
    }
}
