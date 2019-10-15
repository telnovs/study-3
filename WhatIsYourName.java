 
import javax.swing.*;

public class WhatIsYourName{
    public static void main (String [] arqs){
        String name;
        name = JOptionPane.showInputDialog("добрый вечер! Как вас завут??");
        JOptionPane.showMessageDialog(null, "Приятно познакомиться, \n"+name+"!");
    }}