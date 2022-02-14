package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "I am happy.");

        Object[] options = {"Yes","No","ask later"};
        int n = JOptionPane.showOptionDialog(null,
                "Would you like to save it",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[2]);

        Object[] options1 = {"Yes","No"};
        int n1 = JOptionPane.showOptionDialog(null,
                "Would you like to save it",null, JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options1,options[1]);


    }
}
