package bo.milton.codility;

import java.util.Arrays;

public class MissingInteger {

    public int solution(int[] A) {
        // [1, 1, 2]
        Arrays.sort(A);
        int min = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > min) {
                return min;
            } else if (A[i] == min) {
                min++;
            }
        }
        return min;
    }

}
