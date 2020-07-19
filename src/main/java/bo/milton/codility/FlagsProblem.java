package bo.milton.codility;

public class FlagsProblem {

    public int solution(int[] A) {
        int flags = (int) Math.ceil(Math.sqrt(A.length));
        while (flags >= 1) {
            for (int i = 1; i <= A.length; i++) {
                if (isPeak(A, i)) {
                    boolean result = processPeak(A, i, flags, flags - 1);
                    if (result) {
                        return flags;
                    }
                }
            }
            flags--;
        }
        return 0;
    }

    private boolean processPeak(int[] A, int initialIndex, int flags, int flagCounter) {
        if (initialIndex >= A.length || flagCounter == 0) {
            return flagCounter == 0;
        }
        int startingAttempt = flags * 2 - 1 + initialIndex;
        while (startingAttempt >= initialIndex + flags) {
            if (isPeak(A, startingAttempt)) {
                boolean result = processPeak(A, startingAttempt, flags, flagCounter - 1);
                if (result) {
                    return true;
                }
            }
            startingAttempt--;
        }
        return false;
    }

    private boolean isPeak(int[] A, int index) {
        return index > 0 && index < A.length - 1 && A[index] > A[index -1] && A[index] > A[index + 1];
    }

}
