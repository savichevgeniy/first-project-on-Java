package com.company;
import java.util.Random;

public class ArrayOne extends Message {
    private String text, title;
    private int sum;
    private final int size = 17;
    private int [] array = new int[size];
    public void ShowResult() {
        title = "Одномерный массив";
        text = "Дан массив состоящий из 17-ти элементов.\nНайти их сумму";
        super.ShowTask(text, title);

        FillArray();

        text = "Элементы массива:\n" + OutputArray() + "\n";
        text += "Сумма элементов массива = " + CalculateSum();
        super.ShowTask(text, title);
    }
    private void FillArray() {
        for (int i = 0; i < size; i++) {
            Random random = new Random();
           array[i] = random.nextInt(90) + 10;
        }
    }
    private int CalculateSum() {
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }
    private String OutputArray() {
        for (int i: array) {
            text += " | " + i;
        }
        return text;
    }
}
