package different_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int [] array2 = {8,9,10};
        Object [] array1 = {5,6,7,array2};
        Object [] array = {1,2,3,4,array1};

        System.out.println(Arrays.deepToString(array));

        flat(array);
//        doStuff2(array);

        ArrayList<Object> mainList = new ArrayList<>();
        mainList.add(1);
        mainList.add(2);
        mainList.add(3);
        mainList.add(4);
        ArrayList<Object> newList1 = new ArrayList<>();
        newList1.add(5);
        newList1.add(6);
        newList1.add(7);
        newList1.add(8);
        ArrayList<Object> newList2 = new
                ArrayList<>();
        newList2.add(9);
        newList2.add(10);
        newList2.add(11);
        newList1.add(newList2);
        mainList.add(newList1);

        System.out.println(mainList);
        flat(mainList.toArray());
        doStuff2(mainList);

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
    public static void doStuff2(Collection<?> collection){

        System.out.print("[");
        doStuff2Helper(collection);
    }

    public static void doStuff2Helper(Collection<?> collection){
        Iterator<Object> iterator = (Iterator<Object>) collection.iterator();
        while (iterator.hasNext()) {
            Object x = iterator.next();
            if(x instanceof Collection<?>){
                doStuff2Helper((Collection<Object>)x);
            }else{
                System.out.print(x);
                if(iterator.hasNext()){
                    System.out.print(", ");
                }else{
                    System.out.print("]");
                }
            }
        }
    }
}
