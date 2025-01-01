package Object_Orianted_Programming.OOP_four.In_built_Packages.javax_swing;
/*
javax.swing
Description: Provides classes for advanced GUI components.
Classes:
JFrame, JButton, JLabel, JTextField, etc.

java.awt
Description: Used for building graphical user interfaces (GUIs).
Classes:
Button, Label, TextField, Frame, etc.
 */

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 50);

        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

