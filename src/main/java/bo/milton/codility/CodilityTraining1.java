package bo.milton.codility;


import java.util.*;

public class CodilityTraining1 {

    public int solution(int N) {
        System.out.println("");
        System.out.println("");
        boolean started = false;
        int longest = 0;
        int currentLoop = 0;
        while (N > 0) {
            int digit = N & 1;
            if (digit == 1) {
                if (! started) {
                    started = true;
                }
                if (currentLoop > longest) {
                    longest = currentLoop;
                }
                currentLoop = 0;
            } else {
                if (started) {
                    currentLoop++;
                }
            }
            N >>= 1;
        }

        return longest;
    }

    public int[] solution2(int[] A, int K) {
        if (A.length < 2)
            return A;
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int newIndex = (i + K) % A.length;
            result[newIndex] = A[i];
        }
        return result;
    }

    public int solution3(int X, int Y, int D) {
        return (Y - X) / D + ( (Y - X) % D > 0 ? 1 : 0 );
    }

    public int solution4(int X, int[] A) {
        int sum = X * ( X + 1) / 2;
        Set checker = new LinkedHashSet();
        for (int i = 0; i < A.length; i++) {
            if ( ! checker.contains(A[i])) {
                sum -= A[i];
                if (sum == 0) {
                    return i;
                }
                checker.add(A[i]);
            }
        }
        return -1;
    }

    public int solution5(int A, int B, int K) {
        int initial = A;
        boolean started = false;
        int count = 0;
        while (initial <= B) {
            if (initial % K == 0) {
                started = true;
                count++;
            }
            if (started) {
                initial += K;
            }
        }
        return count;
    }

    public int solution5v2(int A, int B, int K) {
        if ( B == K )
            return 1;
        return (B / K) - ( A / K ) +
                ( ( A % K == 0 ) ? 1 : 0 );
    }

    public int solution6(int[] A) {
        Set<Integer> checker = new LinkedHashSet<>();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if ( ! checker.contains(A[i])) {
                count ++;
                checker.add(A[i]);
            }
        }
        return count;
    }

    public int solution7(String S) {
        final String openning = "{[(";
        final Map<Character, Character> mapping = new HashMap<>();
        mapping.put('}', '{');
        mapping.put(']', '[');
        mapping.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for (Character character : S.toCharArray()) {
            if (openning.indexOf(character) >= 0) {
                stack.push(character);
            } else {
                if (stack.size() > 0) {
                    Character gotten = stack.pop();
                    if (gotten != mapping.get(character)) {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        }
        return (stack.size() == 0) ? 1 : 0;
    }

    public int solution8(int[] A) {
        final int halfQuantity = A.length / 2;
        Map<Integer, Counter> counter = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Counter item = counter.get(A[i]);
            if (item == null) {
                item = new Counter(1, i);
                counter.put(A[i], item);
            } else {
                item.quantity += 1;
            }
            if (item.quantity > halfQuantity) {
                return item.index;
            }
        }
        return -1;
    }

    private static class Counter {
        public int quantity;
        public int index;
        public Counter(int quantity, int index) {
            this.quantity = quantity;
            this.index = index;
        }
    }

    public int solution9(int N) {
        int index = 1;
        int quantity = 0;
        while ( index * index < N) {
            if (N % index == 0) {
                quantity+=2;
            }
            index++;
        }
        if ( index * index == N )
            quantity++;
        return quantity;
    }

    public int[] solution10(int[] A) {
        int[] counts = new int[100000];
        boolean[] considered = new boolean[100000];
        for (int i = 0; i < A.length; i++) {
            counts[A[i]] += 1;
            considered[A[i]] = true;
        }

        int[] divisors = new int[100000];
        boolean[] flags = new boolean[100000];
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if ( ! flags[A[i]]) {
                int count = calculateDivisors(counts, A[i], considered);
                flags[A[i]] = true;
                divisors[A[i]] = count;
            }
            result[i] = A.length - divisors[A[i]];
        }
        return result;
    }

    private int calculateDivisors(int[] counts, int number, boolean[] considered) {
        if (1 == number)
            return 1;
        int starting = (int) Math.ceil(Math.sqrt(number));
        int count = 0;
        for (int i = starting; i > 0; i--) {
            if (considered[i] && number % i == 0) {
                count += counts[i];
            }
        }
        if (starting != number)
            return count + counts[number];
        return count;
    }

}
