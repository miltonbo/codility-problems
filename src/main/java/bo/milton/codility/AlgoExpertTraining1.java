package bo.milton.codility;

import java.util.HashMap;
import java.util.Map;

public class AlgoExpertTraining1 {

    public static int getNthFib(int n) {
        return getNthFib(n, new HashMap<>());
    }

    private static int getNthFib(int n, Map<Integer, Integer> alreadyCalculated) {
        if (n == 0 || n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (alreadyCalculated.containsKey(n))
            return alreadyCalculated.get(n);
        int value = getNthFib(n - 1, alreadyCalculated) + getNthFib(n - 2, alreadyCalculated);
        alreadyCalculated.put(n, value);
        return value;
    }

}
