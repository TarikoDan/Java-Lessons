package lesson3_AbstractClass_Interface.ClassWork.Class;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,15);
        rectangle.square();
        Quadrat quadrat = new Quadrat(10);
        quadrat.square();

        Vocalist vitya = new Vocalist("Vitya");
        Vocalist valya = new Vocalist("Valya");
        Vocalist kolya = new Vocalist("Kolya");
        vitya.sing();

        Sportsman jhon = new Sportsman("Jhon", 10.5);
        Sportsman sonia = new Sportsman("Sonia", 10);
        Sportsman max = new Sportsman("Max", 12.5);
        System.out.println(max.run());

        ArrayList<Singer> singers = new ArrayList<>();
        singers.add(kolya);
        singers.add(valya);
        singers.add(vitya);
        System.out.println(singers);

        ArrayList<Runner> runners = new ArrayList<>();
        runners.add(jhon);
        runners.add(max);
        runners.add(sonia);
        System.out.println(runners);
    }
}
