package lesson2_Composition_Agrigation.Task2_Company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee junAndrew = new Employee("Andrew", "Cot", "junior dev ops", 1);
        Employee junMax = new Employee("Max", "Rit", "junior dev", 0);
        Employee midAnn = new Employee("Ann", "Lee", "HR", 3);
        Employee midAnton = new Employee("Anton", "Bosyi", "middle dev", 3);
        Employee midJura = new Employee("Jurij", "Belykh", "middle dev", 4);
        Employee senSerg = new Employee("Sergij", "Malyk", "senior pm", 5);
        Employee bigBoss = new Employee("Sergij", "Zhur", "boss", 8);

        Employee[] employeesLviv = {junAndrew, junMax, midAnn, senSerg, bigBoss};
        Employee[] employeesKyiv = {junAndrew, midAnton, midJura, bigBoss};

        Department depLviv = new Department("Lviv", employeesLviv);
        Department depKyiv = new Department("Kyiv", employeesKyiv);

//        Department[] departments = new Department[2];
//        departments[0] = depLviv;
//        departments[1] = depKyiv;

        ArrayList<Department> departments = new ArrayList<>();
        departments.add(depLviv);
        departments.add(depKyiv);

        Company coolBit = new Company("coolBit", departments);

        System.out.println(coolBit);
    }
}
