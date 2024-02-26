import java.util.ArrayList;

public class StudentGradingSystem {
    public static void main(String[] args) {

        // parameter -> value passed in a method declaration -> information passed to a method -> you can think of a parameter as a variable
        // argument -> value passed in a method call -> you can think of an argument as a value you assign to a variable
        // return -> used to terminate a method and return a value

        // call all your functions here
        greetUser();
        add();
        add();
        add();
        System.out.println(addTwoNumbers());

        int result = addTwoNumbers();
        System.out.println(result + 3);

        System.out.println(addThreeNumbers(3, 4, 5));
        System.out.println(addThreeNumbers(6, 7, 8));
    }

    // method that doesn't return a value
    private static void greetUser(){
        System.out.println(3 + 4);
    }

    private static void add(){
        int num1 = 12;
        int num2 = 38;
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    // return keyword
    // method with no params
    private static int addTwoNumbers(){
        int x = 3;
        int y = 4;
        int result = x + y;
        return result;
    }

    // method with params
    private static int addThreeNumbers(int x, int y, int z){
        int sum = x + y + z;
        return sum;
    }

}
