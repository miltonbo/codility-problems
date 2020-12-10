package bo.milton.codility;

public class TapeEquilibrium {

    // [3, 1, 2, 4, 3]

    public int solution(int[] A) {
        int total = 0;
        for (int j : A) {
            total += j;
        }

        int minDiff = Integer.MAX_VALUE;
        int acumulator = 0;
        for (int i = A.length - 1; i > 0; i --) {
            acumulator += A[i];
            int tmpTotal = total - acumulator;
            int diff = Math.abs(tmpTotal - acumulator);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }


}
