package ArraySection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrx = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Collections.reverse(Arrays.asList(matrx));
        for (int i = 0; i < matrx[0].length; i++) {
            for (int j = 0; j < matrx[0].length; j++) {
                System.out.printf("%d\t", matrx[j][i]);
            }
            System.out.println();
        }
        System.out.println(matrx.getClass().getSimpleName());
        var max = Arrays.stream(matrx).toArray();

    }
}
