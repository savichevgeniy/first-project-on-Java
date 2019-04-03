package com.company;

public class TaskString extends Message {
    private String text = "Проверить есть ли в веденной строке число";
    private String title = "Работа со строками";
    private String str;

    public void ShowResult() {
        super.ShowTask(text, title);
        text = "Введите строку";
        str = super.InputDate(text, title);
        if (FindNumber()) {
            text = "В веденной строке есть цифры";
        }
        else {
            text = "В веденной строке цифр нет";
        }
        super.ShowTask(text, title);
    }
    private boolean FindNumber() {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}

