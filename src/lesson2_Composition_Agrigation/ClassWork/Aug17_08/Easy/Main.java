package lesson2_Composition_Agrigation.ClassWork.Aug17_08.Easy;

public class Main {
    public static void main(String[] args) {
        int[] list = {2,17,13,6,22,31,45,66,100,-18};
        int i = 1;
        while (i<list.length) {
            System.out.println(i + " , " + list[i]);
            i += 2;
        };
        System.out.println("-----------------");
        for (int j : list) {
//            j % 2 == 0 ? System.out.println(j) : System.out.println("");
            if (j % 2 == 0)  {
                System.out.println(j);
            }
        }
        System.out.println("-----------------");

        for (int k = list.length-1; k >= 0; k--) {
            System.out.println(k + " , " + list[k]);

        }


    }
}
