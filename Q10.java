import javax.swing.*;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
        JOptionPane.showMessageDialog(null," I'm sorry, "+name+". I'm afraid I can't do that. \n");
    }
}
