package collections.service;

import collections.entity.MatrixElement;

import java.util.LinkedList;
import java.util.List;

public class ElementOperation {
    public static List<MatrixElement> makeList(int[][] matrix){
        List<MatrixElement> list = new LinkedList<>();

        for(int i = 0; i < matrix.length;i++)
            for(int j = 0; j < matrix[0].length;j++){
                if(matrix[i][j] != 0){
                    MatrixElement matrixElement = new MatrixElement(matrix[i][j],j,i);
                    list.add(matrixElement);
                }
            }
        return list;
    }
}
