package org.example;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // get the users first name
        String name = JOptionPane.showInputDialog("Please Enter Your Name ");
        // get the users age
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        // display the result
        JOptionPane.showMessageDialog(null, name + " is " + age + " years old.");

        System.exit(0);
    }
}