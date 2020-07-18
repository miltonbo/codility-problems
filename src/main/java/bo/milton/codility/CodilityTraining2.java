package bo.milton.codility;

import java.util.*;

public class CodilityTraining2 {

    public int solution(int N, int M) {
        return N / gcd3(N, M, 1);
    }

    public int lcd(int a, int b) {
        return a * b / gcd3(a, b, 1);
    }

    public int gcd(int a, int b) {
        if (a == b)
            return a;
        if (a > b)
            return gcd( a - b, b);
        else
            return gcd( a, b - a);
    }

    public int gcd2(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return gcd2(b, a % b);
    }

    public int gcd3(int a, int b, int res) {
        if (a == b)
            return res * a;
        else if (( a % 2 == 0) && (b % 2 == 0))
            return gcd3(a / 2, b / 2, 2 * res);
        else if (a % 2 == 0)
            return gcd3( a / 2, b, res);
        else if (b % 2 == 0)
            return gcd3(a, b / 2, res);
        else if (a > b)
            return gcd3( a - b, b, res);
        else
            return gcd3(a, b - a, res);
    }

    public int solution2(int[] arr, int total) {
        return recursive(arr, total, arr.length - 1);
//        return dynamicProgramming1(arr, total, arr.length - 1, new HashMap<>());
    }

    public int recursive(int[] arr, int total, int index) {
        if (total == 0)
            return 1;
        if (total < 0)
            return 0;
        if (index < 0)
            return 0;
        if (total < arr[index])
            return recursive(arr, total, index - 1);
        return recursive(arr, total - arr[index], index-1) +
                recursive(arr, total, index - 1);
    }

    public int dynamicProgramming1(int[] arr, int total, int index, Map<String, Integer> mem) {
        String key = total + ":" + index;
        Integer gotten = mem.get(key);
        if (gotten != null)
            return gotten;
        if (total == 0)
            return 1;
        if (total < 0)
            return 0;
        if (index < 0)
            return 0;
        int result;
        if (total < arr[index])
            result = dynamicProgramming1(arr, total, index - 1, mem);
        else
            result = dynamicProgramming1(arr, total - arr[index], index-1, mem) +
                    dynamicProgramming1(arr, total, index - 1, mem);
        mem.put(key, result);
        return result;
    }

    public int solution3(int[] A) {
        Set<Integer> checker = new LinkedHashSet<>();
        for (int i = 0; i < A.length; i++) {
            int absValue = Math.abs(A[i]);
            if (! checker.contains(absValue))
                checker.add(absValue);
        }
        return checker.size();
    }

    public int solution4(int M, int[] A) {
        Set<Integer> checker = new LinkedHashSet<>();
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            if (checker.contains(A[i])) {
                total += (checker.size() * (checker.size() + 1)) / 2;
                checker.clear();
            }
            checker.add(A[i]);
        }
        total += (checker.size() * (checker.size() + 1)) / 2;
        return total;
    }

    public int solution5(int[] A, int[] B) {
        int max = 0;
        Map<String, Boolean> memo = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int j = B.length - 1;
            int counter = 0;
            while (B[j] > A[i] && j > i) {
                if ( ! matches(A, B, i, j, memo)) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                    }
                }
                j--;
            }
        }
        return max;
    }

    public boolean matches(int[] A, int[] B, int i, int j, Map<String, Boolean> memo) {
        String key1 = i +":"+ j;
        String key2 = j +":"+ i;
        if (memo.containsKey(key1)) {
            return memo.get(key1);
        } else {
            boolean result = ( A[j] - B[i] <= -1 );
            memo.put(key1, result);
            memo.put(key2, result);
            return result;
        }
    }

    public int solution6(int[] A) {
        Min min = new Min(null);
        dpSolution6(A, 0, 0, min);
        return min.min;
    }

    public void dpSolution6(int[] A, int index, Integer acumulator, Min min) {
        if (index == A.length) {
            if (min.min == null || Math.abs(acumulator) < min.min)
                min.min = Math.abs(acumulator);
            return;
        }
        dpSolution6(A, index + 1, acumulator + A[index], min);
        dpSolution6(A, index + 1, acumulator - A[index], min);
    }

    public class Min {
        public Integer min;
        public Min(Integer min) {
            this.min = min;
        }
    }

    public int solution6Sol2(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.abs(A[i]);
        }
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        int sum = 0;
        while (i <= j) {
            if (sum <= 0) {
                sum += A[j];
                j--;
            } else {
                sum -= A[i];
                i++;
            }
        }
        return Math.abs(sum);
    }

}
