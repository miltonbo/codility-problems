package bo.milton.codility;

import java.util.*;

public class CodilityTraining3 {


    public int oddOccurrencesInArray(int[] A) {
        Set<Integer> checker = new HashSet<>();
        for (int value : A) {
            if (checker.contains(value)) {
                checker.remove(value);
            } else {
                checker.add(value);
            }
        }
        return checker.iterator().hasNext() ? checker.iterator().next() : 0;
    }

    public int permMissingElem(int[] A) {
        long total = (((long)A.length + 1L) * ((long)A.length + 2L)) / 2L;
        for (int item : A) {
            total -= item;
        }
        return (int) total;
    }

    public int[] maxCounters(int N, int[] A) {
        int[] counters = new int[N];
        boolean[] set = new boolean[N];
        int lastAllAssignedMax = 0;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if (set[A[i] - 1]) {
                    counters[A[i] - 1] += 1;
                } else {
                    counters[A[i] - 1] = lastAllAssignedMax + 1;
                }
                set[A[i] - 1] = true;
                if (counters[A[i] - 1] > max) {
                    max = counters[A[i] - 1];
                }
            } else {
                lastAllAssignedMax = max;
                set = new boolean[N];
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (!set[i]) {
                counters[i] = lastAllAssignedMax;
            }
        }
        return counters;
    }

    public int[] genomicRangeQuery(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        Set<Integer> indexOfA = new HashSet<>();
        Set<Integer> indexOfC = new HashSet<>();
        Set<Integer> indexOfG = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A')
                indexOfA.add(i);
            else if (S.charAt(i) == 'C')
                indexOfC.add(i);
            else if (S.charAt(i) == 'G')
                indexOfG.add(i);
        }
        for (int i = 0; i < P.length; i++) {
            for (Integer item : indexOfA) {
                if (P[i] <= item && item <= Q[i]) {
                    result[i] = 1;
                }
            }
            if (result[i] == 0) {
                for (Integer item : indexOfC) {
                    if (P[i] <= item && item <= Q[i]) {
                        result[i] = 2;
                    }
                }
                if (result[i] == 0) {
                    for (Integer item : indexOfG) {
                        if (P[i] <= item && item <= Q[i]) {
                            result[i] = 3;
                        }
                    }
                    if (result[i] == 0) {
                        result[i] = 4;
                    }
                }
            }
        }
        return result;
    }

    private int minOf(String S, int begin, int end, Map<Character, Integer> values,
                      Map<String, Integer> memo, int minGotten) {
        if (begin == end) {
            return values.get(S.charAt(begin));
        }
        if (S.charAt(begin) == 'A')
            return 1;
        String key = begin + ":" + end;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int current = values.get(S.charAt(begin));
        List<String> keys = new ArrayList<>();
        while (current >= minGotten) {
            keys.add(begin + ":" + end);
            begin++;
            current = values.get(S.charAt(begin));
        }
        begin++;
        int min = minOf(S, begin, end, values, memo, current);
        if (min < current) {
            for (String item : keys) {
                memo.put(item, min);
            }
            return min;
        } else {
            for (String item : keys) {
                memo.put(item, current);
            }
            return current;
        }
    }

}
