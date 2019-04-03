package com.company;
import javax.swing.*;
import static java.lang.Math.*;

public class TaskOne extends Message {
    //Задние переменных для расчтеов.
    private double C, V, T, L;
    private String capacity, inductance, title, text;
    public void ShowResult(){
        text = "Найти период (Т) и частоту (V) колебаний в контуре";
        title = "Задание №1";
        super.ShowTask(text, title);
        text = "Введите емкость конденсатра (С)";
        title = "Ввод данных";
        capacity = super.InputDate(text, title);
        C = Double.parseDouble(capacity);
        text = "Введите индуктивность конденсатра (L)";
        inductance = super.InputDate(text, title);
        L = Double.parseDouble(inductance);
        T = CalculateT(C,L);
        V = CalculateV(T);
        T = Math.round (T * 100.0) / 100.0;
        V = Math.round(V * 100.0)/100.0;
        text = "Период колебаний (T) = " +T + "\n";
        text += "Частота колебаний (V) = " + V + "\n";
        title = "Результаты вычислений:";
        super.ShowTask(text,title);
    }
    private double CalculateT(double c, double l) {
        return 2 * PI * sqrt(l * c);
    }
    private double CalculateV( double t) { return 1 / t; }
}
