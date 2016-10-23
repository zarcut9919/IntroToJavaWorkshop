package day3;

import javax.swing.JOptionPane;

public class MadLibs {
public static void main(String[] args) {
String name=JOptionPane.showInputDialog("My name is ");
String age=JOptionPane.showInputDialog("I am  years old ");
String place=JOptionPane.showInputDialog("I live in ");
JOptionPane.showMessageDialog(null,"My name is "+ name+ "I am " +age + "years old, I live in "+place);
}
}
