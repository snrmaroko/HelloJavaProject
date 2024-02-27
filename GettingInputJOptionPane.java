import javax.swing.*;


public class GettingInputJOptionPane {
    public static void main (String[] args){

        // Create a variable to store username

//        String userName = "";
//
//        // Ask user for their name
//        userName = JOptionPane.showInputDialog("Please enter your Name");
//
//        // Create the output message
//
//        String msg = "Hello " + userName + "!";
//
//        // Output the user data
//
//        JOptionPane.showMessageDialog(null, msg);

        // Write a java program that gets the radius of circle from the user, then outputs in message box the perimeter and area of the circle

      float radius =0;

       float pi = 3;
        //Ask user to input the radius of circle

      String Radius = JOptionPane.showInputDialog("please enter radius");

      float floatRadius = Float.parseFloat(Radius);
      // calculate
        float perimeter = pi * (floatRadius + floatRadius);

        float area = pi * (floatRadius*floatRadius);

        String output = "perimeter: " +perimeter + "\n" + "Area" + area;

        JOptionPane.showMessageDialog(null,output);










    }

}
