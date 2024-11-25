package com.dsa.arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        for(int i=0;i<N;i++)
        {
            for(int j=N-1;j>=0;j--)
            {
                System.out.print(" "+matrix[j][i]+"\t");
            }
            System.out.println("\n");
        }




}
    public static void main(String[] args) {
        RotateImage img = new RotateImage();
        int[][] var = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        img.rotate(var);
    }
}
