import javax.swing.JOptionPane;
public class Module3ClassWork {

    public static void main(String[] args) {

        String User_input;

        User_input = JOptionPane.showInputDialog("Please enter either a 1 or a 0: ");

        Integer Num_Input;

        Num_Input = Integer.parseInt(User_input);

        if (Num_Input == 1) {
            JOptionPane.showMessageDialog(null, "True");

        }

        else if (Num_Input == 0) {

            JOptionPane.showMessageDialog(null, "False");

        }

        else {
            JOptionPane.showMessageDialog(null, "Incorrect Value Type");
        }

        System.exit(0);
    }


}
