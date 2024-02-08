
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Module2ClassWork {

    public static void main(String[] args) {

        int num_1;
        double frac_1;
        double product;


        System.out.print("Please enter a whole number (Integer): ");

        Scanner keyboard_1 = new Scanner(System.in);


        num_1 = keyboard_1.nextInt();


        System.out.print("Please enter a fractional number: ");

        frac_1 = keyboard_1.nextDouble();


        product = num_1 * frac_1;

        JOptionPane.showMessageDialog(null, "The product of your the integer: " + num_1 + "and your double: " + frac_1 + "is: " + product);





    }
}
