package org.example;

public class Matrix {
    public void showMatrix(double[][] matrix){
        for(double[] row: matrix){
            for( double num : row){
                System.out.printf("%s | ", num);
            }
            System.out.println();
        }
    }
    public double[][] transposedMatrix(double[][]matrix){
        int rows = matrix[0].length;
        int cols  = matrix.length;

        double[][]transMatrix = new double[rows][cols];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        return transMatrix;
    }

    public double oddColsMax(double[][] matrix){
        try {
            int columns = matrix[0].length;
            double sum = 0;

            for (int j = 0; j < columns; j += 2) {
                double max = matrix[0][j];
                for (int i = 1; i < matrix.length; i++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
                sum += max;
            }

            return sum;
        } catch (Exception e) {
            System.err.println("Помилка при обчисленнi суми найбiльших елементiв: " + e.getMessage());
            return -1;
        }

    }
    public double evenColsMin(double[][] matrix){
        try {
            int columns = matrix[0].length;
            double sum = 0;

            for (int j = 1; j < columns; j += 2) {
                double min = matrix[0][j];
                for (int i = 1; i < matrix.length; i++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                    }
                }
                sum += min;
            }

            return sum;
        } catch (Exception e) {
            System.err.println("Помилка при обчисленнi суми найбiльших елементiв: " + e.getMessage());
            return -1;
        }

    }

}
