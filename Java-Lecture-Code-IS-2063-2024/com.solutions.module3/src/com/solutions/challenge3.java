/*
* Adrian Mario Balderas
* IS 2063 006 - Challenge 03 -- Determine That Case!
* February 5th, 2024
*  */

package com.solutions;

import javax.swing.*; // JOptionsPane import
import java.util.Scanner; // Scanner import

public class challenge3 {

    public static void main(String[] args) {

        String User_Input; // Declaring String Variable meant for user input
        boolean i = true; // Declaring Boolean variable meant for while loop conditions
        char User_Char; // Declaring Character variable meant for converting a String into a Character

        Scanner Keyboard = new Scanner(System.in); // Creating a new scanner object

        while (i) { // While loop using the "i" boolean variable as its condition


            User_Input = JOptionPane.showInputDialog(null, "Please enter a single alphabetical character."); // GUI popup asking the user to input an alphabetical character

            User_Char = User_Input.charAt(0); // Using the User_Input string and saving its first (0) index character as a new variable


            if (User_Input.length() == 1) { // If statement that will only execute if User_Input is one character long

                if (Character.isLowerCase(User_Char)) { // If statement that tests if User Character is lowercase
                    JOptionPane.showMessageDialog(null, "Your character \"" + User_Char + "\" is lowercase."); // GUI popup that displays results
                    i = false; // Changes value of boolean variable to break loop
                }
                else if (Character.isUpperCase(User_Char)) { // If statement that tests if User Character is Uppercase
                    JOptionPane.showMessageDialog(null, "Your character \"" + User_Char + "\" is uppercase."); // GUI popup that displays results
                    i = false; // Changes value of boolean variable to break loop
                }
                else { // else statement that fires if other if-statements are false
                    JOptionPane.showMessageDialog(null, "Invalid Input. Please enter a alphabetical character."); // GUI popup that lets user know input was invalid and continues loop
                }

            }
            else {
                JOptionPane.showMessageDialog(null, "Only enter 1 character."); // GUI popup that lets user know to only enter 1 character
            }
        }


        Keyboard.close(); // Closing scanner object

        System.exit(0); // Properly closing the program to prevent any memory leaks









    }

}
