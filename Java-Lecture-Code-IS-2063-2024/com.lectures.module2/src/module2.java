// pre-Processor section

import javax.swing.JOptionPane;
import java.util.Scanner;
public class module2 {

    String first_name;

    public static void main(String[] args) {

        String FirstName;

        FirstName = JOptionPane.showInputDialog(null, "What is your Name? ");

        JOptionPane.showMessageDialog(null, "Hello World");

        System.out.println((FirstName));

        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        
        //Integer.parseInt();

        //keyboard.close()

    }

}
