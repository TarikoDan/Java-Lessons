package different_Tasks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array2 = {8,9,10};
        Object [] array1 = {5,6,7,array2};
        Object [] array = {1,2,3,4,array1};

        System.out.println(Arrays.deepToString(array));
        flat(array);

    }
    static void flat(Object[] o) {
        int i = 0;
        for (Object el : o) {
            if (!el.getClass().isArray()) {
                i++;
            }else {
                for (Object o1 : (Object[]) el) {
                    i++;
                }
            }
        }

        Object[] res = new Object[i];
        i = 0;
        for (Object el : o) {
            if (!el.getClass().isArray()) {
                res[i] = el;
                i++;
            }else {
                for (Object o1 : (Object[]) el) {
                    res[i] = o1;
                    i++;
                }
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
