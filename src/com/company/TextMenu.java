package com.company;

import javax.swing.*;

public class TextMenu {
    String input;
    int key;
    public void Menu() {
        do {
            input = WriteKey();
            if (CheckInput(input) && InputNotNull(input)) {
                key = Integer.parseInt(input);
                SwitchCheckKey(key);
            }
        }while (CheckInput(input));
    }
    String text;
    private String WriteKey() {
        return JOptionPane.showInputDialog(null,
                Mymenu(),
                "Сообщение",
                JOptionPane.PLAIN_MESSAGE);
    }
    private String Mymenu(){
        text = "Выберите задаение:\n";
        text += "1. Линейные алгоритмы\n";
        text += "2. Разветвляющейся алгоритмы\n";
        text += "3. Циклы\n";
        text += "4. Одномерные массивы\n";
        text += "5. Двумерные массивы\n";
        text += "6. Строки\n";
        text += "7. Структуры\n";
        text += "Cancel - для выхода";
        return text;
    }
    private boolean InputNotNull(String input){
        if (input.equals("")){
            JOptionPane.showMessageDialog(null,
                    "Вы не ввели значение!",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if (Integer.parseInt(input) >= 8 || Integer.parseInt(input) <= 0 ) {
            JOptionPane.showMessageDialog(null,
                    "Введенное значение не соответсвует пунктку меню",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else {
            return true;
        }
    }

    private boolean CheckInput(String input) {
        if (input == null){
            System.exit(0);
            return false;
        }
        else {
            return true;
        }
    }

    private void SwitchCheckKey(int key) {
        switch (key) {
            case 1:
                TaskOne taskOne = new TaskOne();
                taskOne.ShowResult();
                break;
            case 2:
                TaskTwo taskTwo = new TaskTwo();
                taskTwo.ShowResult();
                break;
            case 3:
                TaskThree taskThree = new TaskThree();
                taskThree.ShowResult();
                break;
            case 4:
                ArrayOne arrayOne = new ArrayOne();
                arrayOne.ShowResult();
                break;
            case 5:
                ArrayTwo arrayTwo = new ArrayTwo();
                arrayTwo.ShowResult();
            case 6:
                TaskString taskString = new TaskString();
                taskString.ShowResult();
        }
    }
}
