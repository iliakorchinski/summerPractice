package collections.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static int[][] readMatrix(String path) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(path));
        int n = scanner.nextInt();
        int[][] x = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }
}
