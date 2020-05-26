package bo.milton.codility.util;

import java.lang.reflect.Method;

public class Measure {

    public static long timeComplexity(Object object, Method method, Object... parameters) {
        try {
            long sum = 0;
            for (int i = 0; i < 100; i++) {
                long starting = System.nanoTime();
                method.invoke(object, parameters);
                sum += System.nanoTime() - starting;
            }
            return sum / 100;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static long timeComplexity(int trials, Object object, Method method, Object... parameters) {
        try {
            long sum = 0;
            for (int i = 0; i < trials; i++) {
                long starting = System.nanoTime();
                method.invoke(object, parameters);
                sum += (System.nanoTime() - starting);
            }
            return sum / (long)trials;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}
