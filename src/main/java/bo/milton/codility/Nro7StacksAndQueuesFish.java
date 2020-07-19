package bo.milton.codility;

import java.util.Stack;

public class Nro7StacksAndQueuesFish {

    public int solution(int[] A, int[] B) {
        Stack<Integer> fishesUpstream = new Stack<>();
        int fishesAlive = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                if (fishesUpstream.size() == 0) {
                    fishesAlive++;
                } else {
                    while (fishesUpstream.size() > 0 && fishesUpstream.peek() < A[i]) {
                        fishesUpstream.pop();
                    }
                    if (fishesUpstream.size() == 0) {
                        fishesAlive++;
                    }
                }
            } else {
                fishesUpstream.push(A[i]);
            }
        }
        return fishesAlive + fishesUpstream.size();
    }

}
