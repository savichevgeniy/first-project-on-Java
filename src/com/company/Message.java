package com.company;
import static javax.swing.JOptionPane.*;

public class Message {
    private String variable;
    public static void ShowTask(String text, String title) {
        showMessageDialog(null,
                text,
                title,
                PLAIN_MESSAGE);
    }
    public String InputDate(String text, String title) {
        variable = showInputDialog(null,
                text,
                title,
                INFORMATION_MESSAGE);
        return variable;
    }
}
