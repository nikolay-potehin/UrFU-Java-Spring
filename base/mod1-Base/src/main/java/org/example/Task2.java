package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[][] b = {{20, 34, 2}, {9, 12, 18}, {3, 4, 5}};
        System.out.println("Массив:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf(b[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Минимальные элементы каждого вложенного массива:");
        getMin(b);
        System.out.println("Минимальные элементы из двумерного массива:");
        getMinValue(b);
    }

    public static void getMin(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];

            for (int j = 0; j < array[0].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];

                }
            }
            System.out.print("#" + i + ": Минимальный элемент " + min + " \n\n");
        }
    }

    public static void getMinValue(int[][] array) {
        int minValue = array[0][0];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                if (array[j][i] < minValue ) {
                    minValue = array[j][i];
                }
            }
        }
        System.out.println(minValue);
    }
}
