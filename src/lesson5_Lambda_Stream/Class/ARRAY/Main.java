package lesson5_Lambda_Stream.Class.ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4, 4, 4, 7, 7, 9, 14);

        Answer answer = new Answer();
        answer.print(integers, 4);
        System.out.println(answer);
        answer.print(integers, 7);
        System.out.println(answer);
        answer.print(integers, 5);
        System.out.println(answer);

    }
}
