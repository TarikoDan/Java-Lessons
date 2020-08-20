package lesson2_Composition_Agrigation.Task3_Request;

import java.nio.file.LinkOption;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Passport p1 = new Passport("aa", 142587, "lviv");
        System.out.println(p1);

        Client c1 = new Client("Alex", "Wood", 12, 3, 2000, "aa", 123456, "Lviv");
        System.out.println(c1);

        Request r1 = new Request(1,"10 Mar 2020", Type.DECLARATION, c1);
        System.out.println(r1);

//        LocalDate date1 = new LocalDate(2000,3,15);
        LocalDate now = LocalDate.now();
        LocalDate of = LocalDate.of(2015, 3, 15);
        System.out.println(of);

    }
}
