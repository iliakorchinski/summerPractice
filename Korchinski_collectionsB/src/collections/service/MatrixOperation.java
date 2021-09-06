package collections.service;

import collections.entity.MatrixElement;

import java.util.List;

public class MatrixOperation {
    public static int[][] sum(List<MatrixElement> list1, List<MatrixElement> list2, int size){
        int[][] result = new int[size][size];
        for(int i = 0; i < result.length;i++)
            for(int j = 0; j < result[0].length;j++){
                if(isListConsist(list1,i,j)){
                    if(isListConsist(list2,i,j))
                        result[i][j] = getValue(list1,i,j) + getValue(list2,i,j);
                    else result[i][j] = getValue(list1,i,j);
                }
                else if(isListConsist(list2,i,j)){
                    result[i][j] = getValue(list2,i,j);
                }
            }
        return result;
    }

    public static int[][] multiply(List<MatrixElement> list1, List<MatrixElement> list2, int m, int n , int o){

        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += getValue(list1,i,k) * getValue(list2,k,j);
                }
            }
        }
        return res;
    }

    private static boolean isListConsist(List<MatrixElement> list,int row, int column){
        for(MatrixElement matrixElement : list){
            if(matrixElement.getColumn() == column && matrixElement.getRow() == row)
                return true;
        }
        return false;
    }

    private static int getValue(List<MatrixElement> list, int row, int column){
        for(MatrixElement matrixElement : list){
            if(matrixElement.getColumn() == column && matrixElement.getRow() == row)
                return matrixElement.getValue();
        }
        return 0;
    }
}
