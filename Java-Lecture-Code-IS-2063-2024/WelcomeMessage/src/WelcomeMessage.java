import javax.swing.JOptionPane; // Importing the JOptionPane Class

public class WelcomeMessage { // Declaring my public class header

    public static void main(String[] args) { // Declaring a method header

        String FirstName, LastName, Users_Color, Str; // Declaring my variables

        int UserAge, Num_Of_People;

        FirstName = JOptionPane.showInputDialog(null, "What is your first name?"); // Getting the users first name

        LastName = JOptionPane.showInputDialog(null, "What is your last name?"); // Getting the users last name

        JOptionPane.showMessageDialog(null, "Hello, " + FirstName + " " + LastName); // Displaying the users name with a greeting

        Str = JOptionPane.showInputDialog(null,"Please enter your age: "); // Asking for the user's age and storing it as a string

        UserAge = Integer.parseInt(Str); // converting the string into an integer

        Users_Color = JOptionPane.showInputDialog(null, "What is your favorite color?"); // Asking the user for their favorite color

        Num_Of_People = 2024 - UserAge; // storing the value of the current year minus user age as a variable

        JOptionPane.showMessageDialog(null, "In 2024, a giant " + Users_Color + " spaceship landed on Earth carrying " + Num_Of_People + " people.  What's even stranger is that the number of people on board that ship was also the year in which you " + FirstName + " " + LastName + ", were born!"); // Inserting user response into a prompt


        System.exit(0); // Using the System.exit method to end the program

    }
}
