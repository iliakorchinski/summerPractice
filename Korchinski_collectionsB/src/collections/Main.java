package collections;

import collections.entity.MatrixElement;
import collections.read.Read;
import collections.service.ElementOperation;
import collections.service.MatrixOperation;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String... args) throws FileNotFoundException {
        int[][] arr1 = Read.readMatrix("src\\resources\\matrix1.txt");
        int[][] arr2 = Read.readMatrix("src\\resources\\matrix2.txt");

        List<MatrixElement> list1 = ElementOperation.makeList(arr1);
        List<MatrixElement> list2 = ElementOperation.makeList(arr2);


        int[][] mtr = MatrixOperation.sum(list1,list2,arr1.length);
        System.out.println(Arrays.deepToString(mtr));

        int [][] mlt = MatrixOperation.multiply(list1,list2,arr1.length,arr2[0].length,arr2.length);
        System.out.println(Arrays.deepToString(mlt));
    }
}
