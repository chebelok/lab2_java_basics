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
    public double[][] transpposedMatrix(double[][]matrix){
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
}
