//Program to get aquainted with the idea of imports
//Type 1: Specific Import
import javax.swing.JOptionPane;
/*
This type of import only lets the user access to a singe class defined in the 
said package
*/
//Type 2: Wildcard import
import java.awt.*;
/*This kind provides access to definition of all class elements.
Sub classes are not automatically visible*/
class Import
{
    public static void main(String [] args)
    {
        System.out.println("Whoa I get imports now!");
    }
}