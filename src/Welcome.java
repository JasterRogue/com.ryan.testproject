import javax.swing.*;

public class Welcome {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter a name: ");
        JOptionPane.showMessageDialog(null,"Welcome " + name + " to year 2");
    }
}
