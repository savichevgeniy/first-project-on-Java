package com.company;
import java.util.Random;

public class ArrayTwo extends Message {
    private String text = "Дана матрица размером 10х10, заполненая целыми случайными числами.\nПоменять местами столбцы.";
    private String title = "Двумерный массив";
    private final int size = 10;
    private Random rnd = new Random();
    private int [][] matrix = new int [size][size];
    private int columnOne, columnTwo;

    public void ShowResult() {
        super.ShowTask(text, title);
        FillMatrix();
        InputColumn();
        text = OutputMatrix();
        SwapColumn();
        text += OutputMatrix();
        super.ShowTask(text, title);
    }

    private void FillMatrix() {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrix[i][j] = rnd.nextInt(90) + 10;
            }
        }
    }

    private void InputColumn() {
        text = "Введите первый столбец";
        columnOne = Integer.parseInt(super.InputDate(text,title)) - 1;
        text = "Введите второй столбец";
        columnTwo = Integer.parseInt(super.InputDate(text,title)) - 1;
    }

    private void SwapColumn() {
       for (int i = 0; i < size; i++) {
           matrix[i][columnTwo] += matrix[i][columnOne];
           matrix[i][columnOne] = matrix[i][columnTwo] - matrix[i][columnOne];
           matrix[i][columnTwo] -= matrix[i][columnOne];
       }
    }

    private String OutputMatrix() {
        text = "Матрица:\n";
        for (int [] i : matrix){
            for (int j : i) {
                text += " | " + j;
            }
            text += "\n";
        }
        return text;
    }

}
