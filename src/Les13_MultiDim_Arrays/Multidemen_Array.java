package Les13_MultiDim_Arrays;

public class Multidemen_Array {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        //System.out.println(number[2]);

        int[][] matrix = {{1, 2, 3, 5, 6,7}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrix[2][1]);
        System.out.println(matrix[1][0]);

        String[][] msrting = new String[2][4];
        System.out.println(msrting[0][1]);

        for (int i =0; i<matrix.length; i++ ){
            for (int j =0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
