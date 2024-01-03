package org.example;

public class Main {
    public static void main(String[] args) {
        int C5 = 1316 % 5; //C=B^T
        int C7 = 1316 % 7; // double
        int C11 = 1316 % 11; // Обчислити суму найбільших елементів в стовпцях матриці з
        // непарними номерами та найменших елементів в стовпцях матриці з парними номерами
        double[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        double num = matrix[2][0];
        System.out.println(num);
        double[][] transM;
        Matrix mat = new Matrix();
        mat.showMatrix(matrix);
        transM =  mat.transposedMatrix(matrix);
        System.out.println("transposed matrix");
        mat.showMatrix(transM);
        System.out.println("Hello world!");
        System.out.println(mat.oddColsMax(transM));
        System.out.println(mat.evenColsMin(transM));
    }
}