package com.company;

import javax.swing.*;
import static java.lang.Math.*;

public class TaskTwo {
    private double x, y, result;
    private String coordinateX, coordinateY, title, text;

    public void ShowResult() {
        Info();
        InputCoordinates();
        x = Double.parseDouble(coordinateX);
        y = Double.parseDouble(coordinateY);
        CalculateFunction(x,y);
        Verification(x,y);
        Show();
    }

    static private void Info() {
        JOptionPane.showMessageDialog(null,
                "Проверить попадает ли точка, заданная координатами Х и У, в заштрихованную область.",
                "Задание №2",
                JOptionPane.INFORMATION_MESSAGE);
    }
    private void InputCoordinates() {
        title = "Ввод координат";
        coordinateX = JOptionPane.showInputDialog(null,
                "Введите координаты Х",
                title,
                JOptionPane.INFORMATION_MESSAGE);
        coordinateY = JOptionPane.showInputDialog(null,
                "Введите координаты У",
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }
    private double CalculateFunction(double x, double y) {
        y = - (pow(x,2)) + 2;
        return y;
    }
    private void Verification(double x, double y) {
        if ((x >= -1.5 && x <= 1.5) && (y >= 0 && y <= 2)){
            text = "Точка попадает в заданную область\n";
        }
        else {
            text = "Точка не попадает в заданную область\n";
        }
    }
    private void Show() {
        text += "Введенные координаты:\n x = " + coordinateX + " y = " + coordinateY;
        JOptionPane.showMessageDialog(null,
                text,
                "Результат",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon("D:\\Предметы\\Java\\Project1\\Graph.png"));
    }
}
