package com.company;
import javax.swing.*;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class TaskThree {
    private final int N = 10;
    private int  nf;
    private String memberRow, text;
    private double x, y, result;
    private ImageIcon img = new ImageIcon("D:\\Предметы\\Java\\Project1\\Ряд.PNG");
    public void ShowResult() {
        ShowTask();
        InputX();
        x = Double.parseDouble(memberRow);
        result = Factorial();
        OutputResult(result);
    }
    private void OutputResult(double res){
        showMessageDialog(null,
                "Сумма ряда = " + res,
                "Результат",
                INFORMATION_MESSAGE,
                img);
    }
    private double Factorial() {
        for (int n = 1; n <= N; n++){
            for (int m = 1; m <= n; m++) {
                nf = n * m;
                y = CalculateRow(n);
            }
        }
        return y;
    }
    private double CalculateRow(int n) {
        return pow(x, n) / nf;
    }
    private void ShowTask(){
        showMessageDialog(null,
                "Написать программу вычисления суммы 10 членов ряда",
                "Задание №3",
                INFORMATION_MESSAGE,
                img);
    }
    private void InputX() {
        memberRow = showInputDialog(null,
                "Введите значение Х",
                "Сообщение",
                INFORMATION_MESSAGE);
    }
}
