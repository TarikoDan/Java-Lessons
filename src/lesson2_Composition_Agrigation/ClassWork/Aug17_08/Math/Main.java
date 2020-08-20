package lesson2_Composition_Agrigation.ClassWork.Aug17_08.Math;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        for (int i = 2; i < 100; i+=2) {
            list1.add(i);
        }
        System.out.println(list1);

        int[] list2 = new int[5];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = 2*i + 2;

        }
        System.out.println(Arrays.toString(list2));

        int[] list3 = new int[100];
        for (int i = 0; i < list3.length; i++) {
            list3[i] = (int) (Math.random()*(2000) - 1000);
        }
        System.out.println(Arrays.toString(list3));
        ArrayList listX = new ArrayList();
        for (int i = 0; i < list3.length; i+=3) {
            if (list3[i] %2 == 0) {
                listX.add(list3[i]);
            }
        }
        System.out.println(listX);
    }
}
