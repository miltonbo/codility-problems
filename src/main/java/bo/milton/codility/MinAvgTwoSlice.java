package bo.milton.codility;

import java.util.*;

public class MinAvgTwoSlice {

    // [ 4, 2, 2, 5, 1, 5, 8 ]

    public int solution(int[] A) {
        PriorityQueue<AverageIndex> priorityQueue = new PriorityQueue<>(Comparator.comparing(item -> item.average));
        int initialSum = A[0];
        for (int slice = 2; slice <= A.length; slice ++) {
            int savedP = 0;
            initialSum += A[slice - 1];
            int sum = initialSum;
            float minAverage = (float) initialSum / (float) slice;

            for (int i = 1; i <= A.length - slice; i++) {
                sum = sum - A[i - 1] + A[i + slice - 1];
                float average = (float) sum / (float) slice;
                if (average < minAverage) {
                    minAverage = average;
                    savedP = i;
                }
            }

            priorityQueue.offer(new AverageIndex(minAverage, savedP));
        }

        return priorityQueue.peek().index;
    }

    class AverageIndex {
        float average;
        int index;

        public AverageIndex(float average, int index) {
            this.average = average;
            this.index = index;
        }
    }

}
